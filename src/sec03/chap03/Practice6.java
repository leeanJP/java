package sec03.chap03;

import java.util.Scanner;

public class Practice6 {
    public static void main(String[] args) {
        String eng[] = { "student", "love", "java", "happy", "future" };
        String kor[] = { "학생", "사랑", "자바", "행복한", "미래" };

        Scanner sc = new Scanner(System.in);

        while (true){
            System.out.println("영어 단어 입력하세요 >>");
            String s = sc.nextLine(); //입력받은 문자를 s에 저장

            if(s.equals("exit")){
                break;
            }
            int i;
            for(i=0; i<eng.length; i++){
                if(eng[i].equals(s)){
                    System.out.println(kor[i]);
                    break;
                }
            }
            if(i == eng.length){
                System.out.println("그런 영어단어는 없습니다");
            }
        }
        System.out.println("종료합니다.");
        sc.close();
    }
}
