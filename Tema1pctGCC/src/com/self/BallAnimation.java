package com.self;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.Timer;

public class BallAnimation {

    public static void main(String[] args) {
        new BallAnimation();
    }
    //Configurarea frame ului
    public BallAnimation() {
        EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                JFrame frame = new JFrame("Ball Routine");
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame.add(new Panel());
                frame.pack();
                frame.setLocationRelativeTo(null);
                frame.setVisible(true);
            }
        });
    }

    public class Panel extends JPanel {
        //coordonatele mingii
        private int x = 0;
        private int y = 0;

        //folosind timer ul refacem panel ul cu pozitii noi ale bilei , avem si delay
        public Panel() {
            Timer timer = new Timer(40, new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    moveBall();
                    repaint();
                }
            });
            timer.start();
        }
        //modificarea coordonatelor astfel incat la fiecare timer sa fie bila pe alta pozitie
        protected void moveBall() {
            x=x+2;
            y++;
            while(x>=195 && y>=50){
                x--;
                y--;
            }
        }

        @Override
        public Dimension getPreferredSize() {
            return new Dimension(400, 400);
        }

        @Override
        protected void paintComponent(Graphics g) {
            super.paintComponent(g);
            Graphics2D g2d = (Graphics2D) g.create();
            g2d.setColor(Color.RED);
            g2d.fillOval(x, y, 60, 60);
            g2d.fillRect(260,115,10,300);
            g2d.fillRect(260,-12,10,60);
            g2d.dispose();
        }

    }

}
