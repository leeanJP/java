package chap04;

import java.util.Scanner;

class Rect {
    private int width, height;
    public Rect(int width, int height) {
        this.width = width;
        this.height = height;
    }
    public int getArea() { return width*height; }
}

public class RectArray {
    public static void main(String[] args) {
        //Scanner 객체 생성
        Scanner scanner = new Scanner(System.in);
        Rect[] r = new Rect[4]; //배열생성
        for (int i = 0; i < r.length; i++) {
            System.out.print(i + 1);
            System.out.print(" 너비와 높이 >>");
            int width = scanner.nextInt();
            int height = scanner.nextInt();
            r[i] = new Rect(width, height);
        }
        System.out.println("저장하였습니다...");
        int sum = 0;
        for (int i = 0; i < r.length; i++){
            sum += r[i].getArea();
        }

        System.out.println("사각형의 전체 합은 " + sum);
        scanner.close();
    }
}
