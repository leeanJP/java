package chap12;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListScore { // 317P 2번 문제
    public static void main(String[] args) {
        ArrayList<Character> arr = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        System.out.println("빈 칸으로 분리하여 5개의 학점을 입력(A/B/C/D/F)>>");

        for(int i=0 ; i<5; i++){
            String s = sc.next();
            if(s.length() > 1){
                System.out.println("Not Character");
                sc.close();
                return;
            }
            char ch = s.toUpperCase().charAt(0);
            if((ch>= 'A' && ch <= 'D') || ch =='F'){arr.add(ch);}
            else{
                System.out.println("유효하지 않은 문자입니다.");
                sc.close();return;
            }
        }
        sc.close();
        double score = 0.0;
        for(int i=0; i<arr.size(); i++){
            char ch = arr.get(i);
            switch (ch){
                case 'A' : score = 4.0; break;
                case 'B' : score = 3.0; break;
                case 'C' : score = 2.0; break;
                case 'D' : score = 1.0; break;
                case 'F' : score = 0.0; break;
            }
            System.out.print(score + "\t");
        }


    }



}
