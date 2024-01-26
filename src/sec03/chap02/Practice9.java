package sec03.chap02;

import java.util.Scanner;

public class Practice9 {
    public static void main(String[] args) {
        System.out.println("1~99 사이의 정수 입력");
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();


        if(number <10){
            if(number%3 == 0){
                System.out.println("박수짝");
            }else {
                System.out.println("박수없음");
            }
        }else if(number >=10){   //number 67
            int first = number /10;   // first 6
            int second = number %10;  // second 7
             if(first%3 == 0 && second %3 ==0 && second !=0){
                System.out.println("박수짝짝");
             }else if(first%3 == 0 || second %3 ==0){
                System.out.println("박수짝");
             }else {
                System.out.println("박수없음");
             }
        }
    }
}
