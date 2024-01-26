package sec03.chap02;

import java.util.Scanner;

public class Practice10 {
    public static void main(String[] args) {
        System.out.println("커피 주문하세요");
        Scanner sc = new Scanner(System.in);

        String menu = sc.next();
        int cnt = sc.nextInt();

        if(menu.equals("에스프레소")) {
            if(cnt >=10){
                System.out.println((int)(cnt*2000*0.95) +"원 입니다");
            }else {
                System.out.println(cnt*2000 +"원 입니다");
            }
        }else if(menu.equals("아메리카노")){
            System.out.println(cnt*2500 +"원 입니다");
        }else if(menu.equals("카푸치노")){
            System.out.println(cnt*3000 +"원 입니다");
        }else if(menu.equals("카페라떼")){
            System.out.println(cnt*3500 +"원 입니다");
        }

    }
}
