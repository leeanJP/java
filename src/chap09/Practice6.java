package chap09;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Practice6 extends JFrame {
    public Practice6(){
        super("3X4 Color Frame");
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        Container c = getContentPane();
        c.setLayout(new GridLayout(4,3));

        JLabel[] label = new JLabel[12];
        for(int i=0; i<label.length; i++){
            label[i] = new JLabel(Integer.toString(i));
            label[i].setOpaque(true);
            label[i].setBackground(Color.WHITE);
            c.add(label[i]);

            label[i].addMouseListener(new MouseAdapter() {
                @Override
                public void mousePressed(MouseEvent e) {
                    JLabel label = (JLabel) e.getSource();
                    int r = (int)(Math.random()*256); //0~255사이의 값
                    int g = (int)(Math.random()*256); //0~255사이의 값
                    int b = (int)(Math.random()*256); //0~255사이의 값
                    label.setBackground(new Color(r,g,b));
                }
            });
        }

        setSize(300,200);
        setVisible(true);


    }

    public static void main(String[] args) {
        new Practice6();
    }
}
