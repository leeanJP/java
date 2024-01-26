package chap08;

import javax.swing.*;
import java.awt.*;

public class Practice4 extends JFrame {
    public Practice4() {
        super("연습문제 4");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container container = getContentPane();

        container.setLayout(new GridLayout(1,10));

        Color [] color = {Color.RED, Color.ORANGE, Color.YELLOW, Color.GREEN,
                Color.CYAN, Color.BLUE, Color.MAGENTA, Color.GRAY,
                Color.PINK, Color.LIGHT_GRAY};

        for(int i=0; i<10; i++){
            JButton btn = new JButton(Integer.toString(i));
            btn.setOpaque(true); //배경색을 보이게 해줌
            btn.setBackground(color[i]);
            container.add(btn);
        }

        setSize(800,200);
        setVisible(true);

    }
    public static void main(String[] args) {
        new Practice4();
    }
}
