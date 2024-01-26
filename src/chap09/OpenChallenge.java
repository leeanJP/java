package chap09;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class OpenChallenge extends JFrame {

    public OpenChallenge(){
        super("Open Challenge");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        setContentPane(new GamePanel()); //GamePanel 을 컨텐트팬으로 등록한다.

        setSize(300,200);
        setVisible(true);

        getContentPane().setFocusable(true);
        getContentPane().requestFocus();
    }

    class GamePanel extends JPanel{
        JLabel[] label = new JLabel[3]; //3개의 수를 담을 레이블 배열
        JLabel result = new JLabel("시작합니다."); //결과를 출력하는 레이블

        public GamePanel() {
            setLayout(null); //배치관리자 사용 X 개발자가 직접 지정

            for(int i=0; i<label.length; i++){
                label[i] = new JLabel("0"); //레이블 생성
                label[i].setSize(80,40); //레이블 크기
                label[i].setLocation(20+ 80*i, 70);// 레이블 위치
                label[i].setHorizontalAlignment(JLabel.CENTER);//레이블 위치를 센터 정렬
                label[i].setOpaque(true); //배경색 설정이 가능하도록
                label[i].setBackground(Color.PINK); //배경색 설정
                label[i].setForeground(Color.black);//폰트색 설정
                label[i].setFont(new Font("TimesRoman" , Font.ITALIC, 30));//폰트 설정
                add(label[i]);
            }
            result.setSize(200, 30);
            result.setLocation(110, 120);
            add(result);
            addKeyListener(new KeyAdapter() {
                @Override
                public void keyPressed(KeyEvent e) {
                    if(e.getKeyChar() == '\n'){ //엔터가 입력된 경우
                        int num1 = (int)(Math.random()*5); // 0~4까지 랜덤수
                        int num2 = (int)(Math.random()*5); // 0~4까지 랜덤수
                        int num3 = (int)(Math.random()*5); // 0~4까지 랜덤수
                        label[0].setText(Integer.toString(num1));
                        label[1].setText(Integer.toString(num2));
                        label[2].setText(Integer.toString(num3));
                        label[0].setBackground(Color.ORANGE);
                        if(num1 == num2 && num2 == num3){
                            result.setText("축하합니다.");
                        }else {
                            result.setText("아쉽네요.");
                        }

                    }
                }
            });
        }



    }



    public static void main(String[] args) {
        new OpenChallenge();
    }
}
