package chap09;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class Practice2 extends JFrame {

    public Practice2(){
        super("키 누르기 뗴기");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Container c = getContentPane();
        c.setBackground(Color.CYAN);
        setSize(300,200);
        setVisible(true);

        c.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                if(e.getKeyCode() =='R'){
                    getContentPane().setBackground(Color.RED);
                }
            }

            @Override
            public void keyReleased(KeyEvent e) {
                if(e.getKeyCode() =='R'){
                    getContentPane().setBackground(Color.CYAN);
                }
            }
        });

        c.setFocusable(true);
        c.requestFocus();
    }

    public static void main(String[] args) {
        new Practice2();
    }
}
