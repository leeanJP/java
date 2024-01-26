//클래스 범위
public class Main {
    //메서드
    public static void main(String[] args) {
        byte a = 127;
        //byte a = 111; // java 정적 자료형 재선언 불가능
        a = 20;  //재할당은 가능하다.
        //처음 선언할 때의 자료형이 달라질 수 없다!
        //a = true;
        short b = 3276;
        int c = 2147483647;

        char ch1, ch2, ch3; //선언을 한번에 할 수 있음!
        char ch4= 'A', ch5 = 'B'; // 선언과 초기화 한번에 가능
        System.out.println(ch4);

        ///System.out.println(ch1); 초기화전에는 사용 불가능!

        ch1 = 'S';
        System.out.println(ch1);

        String e = "문자열";

        final int NUMBER = 1;
        //NUMBER = 2;
        //final 변수는 변수명을 대문자로!
        //변수명에는 예악어 사용 못함!
        //int class = 1;

        //정수 리터럴
        int n = 15; //10진수
        int m = 0x15; //16진수
        int bi = 0b0101; // 2진수
        long g = 24L; //long L l

        //실수 리터럴
        double s = 10.0;
        double d = 0.123;
        double h = 123E-4;  // 123 * 10의 -4승
        double j = 123E+4;  // 123 * 10의 4승
        float f = 0.1234f;

        //문자 리터럴
        char aa ='W';
        char bb ='글';
        char cc ='\uae00';
        for(int i=0; i>3; i++){

        }
        //논리타입 리터럴

        boolean bbb = true;
        boolean ccc = 10<0;

    }
}