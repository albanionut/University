package homework4;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;

public class GUIOptions {

    public GUIOptions(){

        JFrame guiFrame = new JFrame();
        guiFrame.setLocationRelativeTo(null);
        String[] options1 = {"Bicicleta" , "Masinuta" ,"Barca"};
        String[] options2 = {"4 roti" , "2 roti" ,"0 roti"};
        String[] optionChoosed = { "", "" };

        final JPanel comboPanel = new JPanel();
        JLabel comboLb1 = new JLabel("First Option");
        JComboBox  comboBox1 = new JComboBox(options1);

        comboPanel.add(comboLb1);
        comboPanel.add(comboBox1);

        final JPanel listPanel = new JPanel();
        listPanel.setVisible(false);
        JLabel comboLb2 = new JLabel("Second Option");
        JList opt2 = new JList(options2);

        opt2.setLayoutOrientation(JList.HORIZONTAL_WRAP);

        listPanel.add(comboLb2);
        listPanel.add(opt2);

        final JPanel resultPanel = new JPanel();
        resultPanel.setVisible(false);
        JLabel resultLbl = new JLabel("Chosen options of first and second option");
        JList<Object> resultList = new JList<Object>(optionChoosed);
        resultList.setLayoutOrientation(JList.HORIZONTAL_WRAP);
        resultPanel.add(resultLbl);
        resultPanel.add(resultList);

        JButton optionsBut = new JButton("First and Second");
        optionsBut.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                optionChoosed[0] = (String) comboBox1.getSelectedItem();
                listPanel.setVisible(!listPanel.isVisible());
                comboPanel.setVisible(!comboPanel.isVisible());
            }
        });
        JButton resultBut = new JButton("Your choices");
        resultBut.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                optionChoosed[1] = (String) opt2.getSelectedValue();
                listPanel.setVisible(!listPanel.isVisible());
                resultPanel.setVisible(!resultPanel.isVisible());
                resultBut.setVisible(false);
                optionsBut.setVisible(false);
            }
        });


        guiFrame.add(comboPanel, BorderLayout.NORTH);
        guiFrame.add(listPanel, BorderLayout.CENTER);
        guiFrame.add(optionsBut, BorderLayout.SOUTH);
        guiFrame.add(resultBut, BorderLayout.EAST);
        guiFrame.add(resultPanel, BorderLayout.WEST);

        guiFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        guiFrame.setTitle("GUI Interface");
        guiFrame.setSize(300,250);
        guiFrame.setVisible(true);
    }

    public static void main(String[] args) {

        GUIOptions gui = new GUIOptions();



    }


}
