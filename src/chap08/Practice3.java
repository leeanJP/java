package chap08;

import javax.swing.*;
import java.awt.*;

public class Practice3 extends JFrame {
    public Practice3(){
        super("연습문제 3");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container container = getContentPane();

        container.setLayout(new FlowLayout());

        container.add(new JLabel("100"));
        container.add(new JLabel("+"));
        container.add(new JLabel("200"));
        container.add(new JButton("="));
        container.add(new JLabel("300"));

        setSize(400,150);
        setVisible(true);


    }

    public static void main(String[] args) {
        new Practice3();
    }
}
