package sec03.chap02;

import java.util.Scanner;

public class Practice6 {
    public static void main(String[] args) {
        System.out.println("돈의 액수 입력");
        Scanner sc = new Scanner(System.in);
        int money = sc.nextInt();

        int ohman = money/50000;
        money = money%50000;
        int man = money/10000;
        money = money %10000;
        int ohchun = money/5000;
        money = money %5000;
        int chun = money/1000;
        money = money%1000;
        int ohback = money/500;
        money = money%500;
        int back = money/100;
        System.out.print("오만원" + ohman + "개 ");
        System.out.print(",만원" + man + "개 ");
        System.out.print(",오천원" + ohchun + "개 ");
        System.out.print(",천원" + chun + "개 ");
        System.out.print(",오백원" + ohback + "개 ");
        System.out.print(",백원" + back + "개 ");


    }
}
