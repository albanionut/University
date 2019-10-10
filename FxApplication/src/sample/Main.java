package sample;

import com.sun.xml.internal.bind.v2.model.core.ID;
import javafx.application.Application;
import javafx.embed.swing.SwingFXUtils;
import javafx.fxml.FXMLLoader;
import javafx.scene.Group;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.ImageView;
import javafx.scene.image.WritableImage;
import javafx.stage.Stage;
import jdk.nashorn.internal.ir.WhileNode;
import org.opencv.core.*;
import org.opencv.core.Point;
import org.opencv.imgcodecs.Imgcodecs;
import org.opencv.imgproc.Imgproc;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class Main extends Application {

    private Point pt2;

    @Override
    public void start(Stage stage) throws Exception {
        WritableImage writableImage = loadImage();

        ImageView imageView = new ImageView(writableImage);
        imageView.setX(50);
        imageView.setY(40);
        imageView.setFitHeight(400);
        imageView.setFitWidth(500);
        imageView.setPreserveRatio(true);

        Group root = new Group(imageView);
        Scene scene = new Scene(root, 600, 500);
        stage.setTitle("Reading an image");
        stage.setScene(scene);
        stage.show();

    }

    public WritableImage loadImage() throws IOException {
        System.loadLibrary(Core.NATIVE_LIBRARY_NAME);

        String file = "roi.jpg";
        Mat image = Imgcodecs.imread(file, Imgcodecs.IMREAD_COLOR);


        //Proprietati
        Mat gray = new Mat();

        System.out.println(image.rows());
        System.out.println(image.cols());
        System.out.println(image.channels());
        //System.out.println(image.dump()); continut matrice ,dar nu merge

        //Transformarea unei imagine color in grey
        Imgproc.cvtColor(image, gray, Imgproc.COLOR_RGB2GRAY);

        //Contrast
        Mat highcontrast = new Mat();
        gray.convertTo(highcontrast, -1, 1.5, 0);

        //Luminozitate
        Mat highbrightnes = new Mat();
        gray.convertTo(highbrightnes, -1, 1, -75);

        //Histograma
        Mat gray_hist = new Mat();
        Imgproc.cvtColor(image, gray_hist, Imgproc.COLOR_RGB2GRAY);

        Mat histograma = new Mat();

        List<Mat> images = new ArrayList<Mat>();
        images.add(gray_hist);

        //Filter
        Mat filter = new Mat();
        int kernelSize = 3;
        Mat kernel = new Mat(kernelSize, kernelSize, CvType.CV_32F) {
            {

                put(0, 0, 1.0 / 9);
                put(0, 1, 1.0 / 9);
                put(0, 2, 1.0 / 9);

                put(1, 0, 1.0 / 9);
                put(1, 1, 1.0 / 9);
                put(1, 2, 1.0 / 9);

                put(2, 0, 1.0 / 9);
                put(2, 1, 1.0 / 9);
                put(2, 2, 1.0 / 9);
            }

        };
        Imgproc.filter2D(gray_hist, filter, -1, kernel);

        //Sobel
        Mat sobel = new Mat();
        int kernelSizeSobel = 3;
        Mat kernelsobel = new Mat(kernelSizeSobel, kernelSizeSobel, CvType.CV_32F) {
            {

                put(0, 0, -1);
                put(0, 1, 0);
                put(0, 2, 1);

                put(1, 0, -2);
                put(1, 1, 0);
                put(1, 2, 2);

                put(2, 0, -1);
                put(2, 1, 0);
                put(2, 2, 1);
            }

        };
        Imgproc.filter2D(gray_hist, sobel, -1, kernelsobel);

        //Sobel vertical si orizontal
        Mat sobelintern = new Mat();
        Imgproc.Sobel(gray_hist, sobelintern, -1, 1, 1);

        //set the number of bins at 256
        MatOfInt histSize = new MatOfInt(250);
        //only one channel
        MatOfInt channels = new MatOfInt(0);
        //set the ranges
        MatOfFloat histRange = new MatOfFloat(0, 256);
        Imgproc.calcHist(images.subList(0, 1), channels, new Mat(), histograma, histSize, histRange, false);

        int hist_w = 512; //width of the histogram image
        int hist_h = 512; //height of the histogram image

        //Numbers of bins in pixel
        int bin_w = (int) Math.round(hist_w / histSize.get(0, 0)[0]);

        Mat histImage = new Mat(hist_h, hist_w, CvType.CV_8UC3, new Scalar(0, 0, 0));

        //normalize the result to [0,histImage.rows()]
        System.out.println("hist_image rows:" + histImage.rows());
        Core.normalize(histograma, histograma, 0, histImage.rows(), Core.NORM_MINMAX, -1, new Mat());
        System.out.println(bin_w);

        //Effectively draw the histogram(s)
        for (int i = 1; i < histSize.get(0, 0)[0]; i++) {
            Imgproc.line(histImage,
                    new Point(bin_w * (i - 1), hist_h - Math.round(histograma.get(i - 1, 0)[0])),
                    new Point(bin_w * (i), hist_h - Math.round(histograma.get(i, 0)[0])),
                    new Scalar(255, 255, 255), 2, 8, 0);

        }

        //Binarizare
        Mat binary = new Mat();
        Imgproc.threshold(gray_hist, binary, 105, 255, Imgproc.THRESH_BINARY);

            //Median
            Mat median = new Mat();
            Imgproc.medianBlur(gray_hist, median, 25);

        //Canny
        Mat canny = new Mat();
        Imgproc.Canny(gray_hist, canny, 50, 200);

        //Changing the color of the canny
        Mat houghColor = new Mat();
        Imgproc.cvtColor(canny, houghColor, Imgproc.COLOR_GRAY2BGR);

        //Detecting the hough lines from canny
        Mat lines = new Mat();
        //vector pentru salvarea liniilor
        //Canny imaginea sursa
        //lines vector pentru salvarea liniilor
        //1-precizie in pixeli
        //Math.PI/180 = 1 grad - precizie unghiulara
        //50 - numarul minim de puncte gasite in spatiul hough(votes)
        //200- lungimea minima a liniei in pixeli
        //20-lungimea minima intre linii pentru a fi considerata o linie
        Imgproc.HoughLinesP(canny, lines, 1, Math.PI / 180, 20, 20, 10);

        //Drawing lines on the image
        Point pt1 = new Point();
        Point pt2 = new Point();

        //Erode
        Mat erode = new Mat();
        int erosionsize = 5;
        Size ksize = new Size(erosionsize, erosionsize);
        //kernel pentru eroziune si dilatare
        Mat element = Imgproc.getStructuringElement(Imgproc.MORPH_RECT, ksize);
        Imgproc.erode(binary, erode, element);

        //Dilate
        Mat dilate = new Mat();
        Imgproc.dilate(binary, dilate, element);

        for (int i = 0; i < lines.rows(); i++) {
            double datavals[] = lines.get(i, 0);
            pt1 = new Point(datavals[0], datavals[1]);// x1 si y1
            pt2 = new Point(datavals[2], datavals[3]);//x2 si y2

            //Desenarea fiecarei linii
            Imgproc.line(houghColor, pt1, pt2, new Scalar(0, 0, 255), 3);
        }

        //Opening
        Mat opening = new Mat();
        Imgproc.dilate(erode, opening, element);

        //Closing
        Mat closing = new Mat();
        Imgproc.erode(dilate, closing, element);

        //findConturs
        List<MatOfPoint> countours = new ArrayList<>();
        Imgproc.findContours(canny, countours, new Mat(), Imgproc.RETR_LIST, Imgproc.CHAIN_APPROX_NONE);

        Iterator<MatOfPoint> iterator = countours.iterator();

        Mat drawContour = new Mat();
        Imgproc.cvtColor(canny, drawContour, Imgproc.COLOR_GRAY2BGR);

        while (iterator.hasNext()) {
            MatOfPoint contour = iterator.next();
            //calculate area of contour
            double area = Imgproc.contourArea(contour);
            System.out.println("Area: " + area);

            Rect rect = Imgproc.boundingRect(contour);
            Imgproc.rectangle(drawContour, new Point(rect.x, rect.y),
                    new Point(rect.x + rect.width, rect.y + rect.height),
                    new Scalar(255, 0, 0), 3);
            System.out.println(rect.x + ":" + rect.y + ":" + rect.width + ":" + rect.height);
        }

        //HSV
        Mat hsv = new Mat();
        Imgproc.cvtColor(image, hsv, Imgproc.COLOR_RGB2HSV);
        Scalar lowerThreshold = new Scalar(230, 0, 0);
        Scalar upperThreshold = new Scalar(255, 0, 0);
        Core.inRange(image, lowerThreshold, upperThreshold, hsv); // img


        MatOfByte matOfByte = new MatOfByte();
        Imgcodecs.imencode(".jpg",lines, matOfByte);

        byte[] byteArray = matOfByte.toArray();
        InputStream in = new ByteArrayInputStream(byteArray);

        BufferedImage bufImage = ImageIO.read(in);
        WritableImage writableImage = SwingFXUtils.toFXImage(bufImage, null);

        return writableImage;
    }

    public static void main(String[] args) {
        launch(args);
    }
}
