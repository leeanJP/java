package sec03.chap01;

public class Ex01 {
    public static void main(String[] args) {
        byte _1b_byte = 1;
        short _2b_short = 2;
        int _4b_int = 3;
        long _8b_long = 4;

        //_1b_byte = -129;
        //묵시적 형변환 > 작은자료형의 자료를 큰 자료형에 담을 때
        _2b_short = _1b_byte;
        _4b_int = _2b_short;

        //작은 자료형에 큰 자료형을 담을 때에는 그냥 넣을 수 없다.
        _4b_int = (int)_8b_long;

        byte byteNum;
        int smallIntNum = 123;
        byteNum = (byte)smallIntNum;

        int intNum = 12345;
        byteNum = (byte) intNum;


        long _8b_long1 = 123_456_789_123_456_789L;
        int _4b_int2 = 123_456_789;

    }
}
