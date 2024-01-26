package chap08;

import java.util.Scanner;

public class Kawibawibo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final String[] s = {"가위","바위", "보"};
        int user , com;
        while (true){
            System.out.println("가위(1), 바위(2), 보(3), 끝내기(4) >>");
            user = scanner.nextInt();
            if(user == 4){break;} //게임 끝내기
            com = (int)(Math.random()*3 +1);

            if(user <1 || user> 3){
                System.out.println("잘못 입력하였습니다.");
            }else {
                System.out.print("사용자 " +s[user-1]  + ":");
                System.out.println("컴퓨터" + s[com-1]);
                int diff = user - com;
                switch (diff){
                    case 0: //같은걸 낼 경우
                        System.out.println("비겼습니다");
                        break;
                    case -1:  //사용자가 가위, 컴퓨터가 바위 or 사용자가 바위, 컴퓨터가 보
                    case 2:   //사용자가 보, 컴퓨터가 가위
                        System.out.println("사용자가 졌습니다.");
                        break;
                    case 1: //사용자가 바위 컴퓨터가 가위 or 사용자가 보 컴퓨터가 바위
                    case -2 : //사용자가 가위 컴퓨터가 보
                        System.out.println("사용자가 이겼습니다.");
                        break;
                }
            }//else문 종료
        } //while문 종료
        System.out.println("게임을 종료합니다.");
        scanner.close();
    }
}
