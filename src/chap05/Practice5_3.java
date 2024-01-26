package chap05;


import java.util.*;

abstract class Calculator {
    protected int a, b;
    protected void input() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("정수 2개를 입력하세요>>");
        a = scanner.nextInt();
        b = scanner.nextInt();
    }
    public void run() {
        input();
        int res = calc();
        System.out.println("계산된 값은 " + res);
    }

    protected abstract int calc(); //추상메소드
}

//Adder Subtracter 클래스를 작성하라
class Adder extends Calculator{
    @Override
    protected int calc() {
        return a+b;
    }
}

class Subtracter extends Calculator{
    @Override
    protected int calc() {
        return a-b;
    }
}

public class Practice5_3 {
    public static void main(String[] args) {
        Adder adder = new Adder();
        Subtracter sub = new Subtracter();

        adder.run();
        sub.run();
    }
}
