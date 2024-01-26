package chap09;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class Practice4 extends JFrame {
    public Practice4(){
        super("+ ,- 키로 폰트 크기조절");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Container c = getContentPane();
        c.setLayout(new FlowLayout());
        JLabel label = new JLabel("Love Java");
        label.setFont(new Font("TimesRoman", Font.PLAIN, 10)); //폰트 지정
        c.add(label);

        label.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                if(e.getKeyChar() == '+'){
                    JLabel la = (JLabel)e.getSource();
                    Font f = la.getFont();
                    int size = f.getSize();
                    la.setFont(new Font("TimesRoman", Font.PLAIN, size+5));
                }else if(e.getKeyChar() == '-'){
                    JLabel la = (JLabel)e.getSource();
                    Font f = la.getFont();
                    int size = f.getSize();
                    if(size <= 5){
                        return;
                    }
                    la.setFont(new Font("TimesRoman", Font.PLAIN, size-5));
                }
            }
        });

        setSize(300,200);
        setVisible(true);

        label.setFocusable(true);
        label.requestFocus();
    }

    public static void main(String[] args) {
        new Practice4();
    }
}
