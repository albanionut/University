package lab1;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        SimpleFrame frame=new SimpleFrame("Rectangle");
        frame.setSize(850,800);
        frame.setVisible(true);
        frame.setResizable(false);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }
}
