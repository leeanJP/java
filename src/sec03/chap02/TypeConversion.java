package sec03.chap02;

public class TypeConversion {
    public static void main(String[] args) {
        byte b = 127;
        int i = 100;
        System.out.println(b+i); // b가 int 타입으로 자동 변환
        System.out.println(10/4);
        System.out.println(10.0/4); // 4가 4.0으로 자동 변환
        System.out.println((char)0x12340041);

        //char  2바이트 범위 16진수 0x12340041 총 4바이트 범위
        //하위 2바이트  0x41

        System.out.println((byte)(b+i));
        //227 byte 8bit  1 + -   7 자리가진다
        // 227 > 2진수 110 0011  >> 001 1101 >> 10진수 29 앞의 부호비트 1 -29


        System.out.println((int)2.9 + 1.8);
        System.out.println((int)(2.9 + 1.8));
        System.out.println((int)2.9 + (int)1.8);
    }
}
