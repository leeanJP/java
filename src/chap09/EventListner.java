package chap09;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class EventListner extends JFrame {

    public EventListner(){
        setTitle("이벤트 리스너 예제");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Container c = getContentPane();
        c.setLayout(new FlowLayout());
        JButton btn = new JButton("Action");

        //액션리스너 달기
        //btn.addActionListener(new MyActionListner());
        btn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                JButton b = (JButton) e.getSource(); //이벤트 소스 버튼 알아내기
                if(b.getText().equals("Action")){
                    b.setText("액션");
                }else{
                    b.setText("Action");
                }
                setTitle(b.getText());
            }
        });


        c.add(btn);

        setSize(250,120);
        setVisible(true);

    }



    class MyActionListner implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {

            JButton b = (JButton) e.getSource(); //이벤트 소스 버튼 알아내기
            if(b.getText().equals("Action")){
                b.setText("액션");
            }else{
                b.setText("Action");
            }
            EventListner.this.setTitle(b.getText());
        }
    }

    public static void main(String[] args) {
        new EventListner();
    }

}
