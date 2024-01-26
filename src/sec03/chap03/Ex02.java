package sec03.chap03;

public class Ex02 {
    public static void main(String[] args) {
        //  각 문자는 상응하는 정수를 가짐
        char ch1 = 'A';
        char ch2 = 'B';
        char ch3 = 'a';
        char ch4 = 'a' + 1;
        char ch5 = '가';
        char ch6 = '가' + 1;
        char ch7 = '가' + 2;
        char ch8 = '가' + 3;
        char ch9 = '나';

        int ch1Int = (int) ch1;
        int ch9Int = (int) ch9;

        //  ⚠️ 빈 문자는 사용 불가, 공백(space)는 가능
        //  - 이후 배울 문자열(String)과의 차이
       // char empty = '';
        String emptyStr = "";

        char space = ' ';

        int num = 6;
        //  💡 &&가 ||보다 우선순위 높음
        boolean boolA = (num % 3 == 0) && (num % 2 == 0) || (num > 0) && (num > 10);
        boolean boolB = (num % 3 == 0) && ((num % 2 == 0) || (num > 0)) && (num > 10);


    }
}
