package sec03.chap03;

import java.util.Scanner;

public class Practice1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("알파벳 한문자 입력하세요");
        String s = sc.next();
        char c = s.charAt(0);

        for(char i = 'a'; i<=c; i++){
            for(char j=i; j<=c; j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
