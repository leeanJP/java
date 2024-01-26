package chap04;

public class Ex02 {
    public static void main(String[] args) {
        sayHello();

        int count1 = getCount();
        int count2 = getCount();
        int count3 = getCount();
        int count4 = getCount();

        //  ⭐️ 문자열은 객체(참조형)지만 원시형처럼 다뤄짐
        String str1 = "코인 함";
        String str2 = "관심 없음";
        str2 = str1; // 🔴

        str1 = "고점에 익절";
    }


    //  매개변수도, 반환값도 없는 메소드
    static void sayHello () {
        System.out.println("안녕하세요!");
    }

    static int count = 0;

    //  매개변수 없이 값만 반환하는 메소드
    //  외부 변수 값을 변화시킴 (static이므로 static 변수만 가능)
    static int getCount () {
        System.out.println("카운트 증가");
        return ++count;
    }

}
