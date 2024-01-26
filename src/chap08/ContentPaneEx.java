package chap08;

import javax.swing.*;
import java.awt.*;

public class ContentPaneEx extends JFrame {
    public ContentPaneEx() {
        setTitle("ContentPane과 JFrame 예제"); // 프레임의 타이틀  달기
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // 프레임 윈도우를 닫으면 프로그램 종료

        Container contentPane = getContentPane(); // 컨텐트 팬을 알아낸다.
        contentPane.setBackground(Color.ORANGE); // 오렌지색 배경 설정
        contentPane.setLayout(new FlowLayout(FlowLayout.LEFT , 30 , 40)); // 컨텐트팬에 FlowLayout 배치관리자 달기
        contentPane.add(new JButton("OK")); // OK 버튼 달기
        contentPane.add(new JButton("Cancel")); // Cancel 버튼 달기
        contentPane.add(new JButton("Ignore")); // Ignore 버튼 달기
        contentPane.add(new JButton("Ex1"));
        contentPane.add(new JButton("Ex2"));
        contentPane.add(new JButton("Ex3"));

        setSize(300, 150); // 프레임 크기 300x150 설정
        setVisible(true); // 화면에 프레임 출력
    }

    public static void main(String[] args) {
        new ContentPaneEx();
    }
}
