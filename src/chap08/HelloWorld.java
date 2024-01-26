package chap08;

import javax.swing.*;

public class HelloWorld {
    public static void main(String[] args) {

        JFrame mainFrame = new JFrame(); //새 창 생성

        mainFrame.setSize(800,600); //창 사이즈
        //창 닫을 시 프로그램 종료
        mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        mainFrame.setVisible(true); //창 보이게 하기


    }


}
