package chap08;

import javax.swing.*;
import java.awt.*;

public class Practice6 extends JFrame {
    public Practice6(){
        super("연습문제 6");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container container = getContentPane();

        container.setLayout(null);

        for(int i=0; i<20; i++){
            JLabel label = new JLabel(Integer.toString(i));
            label.setForeground(Color.MAGENTA);//label font 색 지정
            int x = (int)(Math.random()*220 + 30);
            int y = (int)(Math.random()*220 + 30);
            label.setLocation(x,y);
            label.setSize(20,20);
            container.add(label);
        }

        setSize(300,300);
        setVisible(true);

    }

    public static void main(String[] args) {
        new Practice6();
    }
}
