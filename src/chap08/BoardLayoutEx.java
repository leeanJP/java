package chap08;

import javax.swing.*;
import java.awt.*;

public class BoardLayoutEx extends JFrame {

    public BoardLayoutEx(){
        setTitle("BoardLayoutEx"); // 프레임의 타이틀  달기
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // 프레임 윈도우를 닫으면 프로그램 종료

        Container contentPane = getContentPane(); // 컨텐트 팬을 알아낸다.

        contentPane.setLayout(new BorderLayout(30,30));

        contentPane.add(new JButton("Calc"), BorderLayout.CENTER); // OK 버튼 달기
        contentPane.add(new JButton("1"), BorderLayout.NORTH); // OK 버튼 달기
        contentPane.add(new JButton("2"), BorderLayout.SOUTH); // OK 버튼 달기
        contentPane.add(new JButton("3"), BorderLayout.WEST); // OK 버튼 달기
        contentPane.add(new JButton("4"), BorderLayout.EAST); // OK 버튼 달기


        setSize(300, 150); // 프레임 크기 300x150 설정
        setVisible(true); // 화면에 프레임 출력
    }

    public static void main(String[] args) {
        new BoardLayoutEx();
    }
}


