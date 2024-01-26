package chap10;

import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;

public class LabelEx extends JFrame {
	public LabelEx() {
		setTitle("레이블 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());

		 // 문자열 레이블 생성
		JLabel textLabel = new JLabel("존카멕 ");
		
		// 이미지 레이블 생성
		ImageIcon img = new ImageIcon("src/chap10/img/john.jpg");// 이미지 로딩
		img.setImage(img.getImage().getScaledInstance(300,350, Image.SCALE_SMOOTH));

		JLabel imageLabel = new JLabel(img); // 레이블 생성

		// 문자열 이미지 모두 가진 레이블 생성
		ImageIcon icon = new ImageIcon("src/chap10/img/call.jpg");// 이미지 로딩
		icon.setImage(icon.getImage().getScaledInstance(80,80, Image.SCALE_SMOOTH));

		JLabel label = new JLabel("커피한잔 할래요",
				icon, SwingConstants.CENTER);// 레이블 생성

		// 컨텐트팬에 3 개의 레이블 삽입
		c.add(textLabel);
		c.add(imageLabel);		
		c.add(label);
		
		setSize(300,500);		
		setVisible(true);
	}
	public static ImageIcon resize(ImageIcon icon, int extent) {
		return new ImageIcon(icon.getImage().getScaledInstance(extent, extent, Image.SCALE_SMOOTH));
	}


	public static void main(String [] args) {
		new LabelEx();
	}
}




