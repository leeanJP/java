package chap08;

import javax.swing.*;
import java.awt.*;

public class Practice5 extends JFrame {
    public Practice5() {
        super("연습문제 5");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container container = getContentPane();

        container.setLayout(new GridLayout(4,4));
        JLabel [] label = new JLabel [16];
        Color [] color = {Color.RED, Color.ORANGE, Color.YELLOW, Color.GREEN,
                Color.CYAN, Color.BLUE, Color.MAGENTA, Color.GRAY,
                Color.PINK, Color.LIGHT_GRAY, Color.WHITE, Color.DARK_GRAY,
                Color.BLACK, Color.ORANGE, Color.BLUE,Color.MAGENTA};


        for(int i =0; i<label.length; i++){
            label[i] = new JLabel(Integer.toString(i));
            label[i].setOpaque(true);
            label[i].setBackground(color[i]);
            container.add(label[i]);
        }


        setSize(400,150);
        setVisible(true);

    }
    public static void main(String[] args) {
        new Practice5();
    }
}
