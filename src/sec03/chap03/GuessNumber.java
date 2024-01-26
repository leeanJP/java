package sec03.chap03;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class GuessNumber {
    public static void main(String[] args) {
        int low, high; //카드에 적힌 수의 범위
        int card; //카드에 적힌 번호 값(정답)
        Random r = new Random(); // 난수 만드는 객체 생성
        Scanner sc = new Scanner(System.in);

        while(true){
            int i=0; // 사용자의 시행 횟수
            low = 0;
            high = 99;
            card = r.nextInt(100); //0~99까지의 랜덤 수 만들어준다.
            System.out.println("Up & Down 게임입니다. 숨겨진 수를 맞추어보세요.");

            while(true){
                System.out.println(low + "-" + high);
                System.out.print(i +">>");
                int n =0;
                try {
                    n = sc.nextInt(); // 입력 받은 값 담음

                }catch (InputMismatchException e){
                    System.out.println("정수를 입력하셔아 함");
                    sc.nextLine();
                    continue;
                }
                //숫자를 맞추는 로직 작성
                if(n <low || n>high){
                    System.out.println("범위를 벗어났음");
                }else {
                    //숫자를 맞췄을 때
                    if(n == card){
                        System.out.println("맞았습니다.");
                        break; // 내부 while문 종료
                    }else if(n > card){
                        System.out.println("더 낮게!");
                        high = n;
                    }else if (n <card){
                        System.out.println("더 높게!");
                        low = n;
                    }
                }
                i++;

            }
            System.out.println("다시 하시겠습니까?(y/n)>>");
            if(sc.next().equals('n')){
                break;
            }
        }
        sc.close();
    }
}
