package sec03.chap03;

import java.util.Scanner;

public class Practice8 {
    public static void main(String[] args) {
        String com[] = {"가위", "바위", "보"};
        Scanner sc = new Scanner(System.in);

        System.out.println("컴퓨터와 가위 바위 보 게임을 합니다");

        while(true){
            System.out.println("가위 바위 보!");
            String s = sc.nextLine();
            if(s.equals("그만")){break;}
            int n = (int)(Math.random()*3); // 0 1 2 랜덤 정수 리턴
            String b = com[n];
            System.out.print("사용자 = " + s + ",  컴퓨터 = "+  b+ " ,");
            if(s.equals("가위")){
                if(b.equals("가위")){
                    System.out.println("비겼습니다");
                }else if(b.equals("바위")){
                    System.out.println("컴퓨터가 이겼습니다.");
                }else if(b.equals("보")){
                    System.out.println("이겼습니다.");
                }
            }else if(s.equals("바위")){
                if(b.equals("가위")){
                    System.out.println("이겼습니다.");
                }else if(b.equals("바위")){
                    System.out.println("비겼습니다");
                }else if(b.equals("보")){
                    System.out.println("컴퓨터가 이겼습니다.");
                }
            }else if(s.equals("보")){
                if(b.equals("가위")){
                    System.out.println("컴퓨터가 이겼습니다.");
                }else if(b.equals("바위")){
                    System.out.println("이겼습니다.");
                }else if(b.equals("보")){
                    System.out.println("비겼습니다");
                }
            }else {
                System.out.println("가위 바위 보 중에 입력하세요!! 제발~~");
            }
        }
        System.out.println("프로그램을 종료합니다.");
        sc.close();
    }

}
