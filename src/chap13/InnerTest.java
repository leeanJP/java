package chap13;
class OutClass {

    private int num = 10;
    private static int sNum = 20;
    private InClass inClass;

    public OutClass(){
        inClass = new InClass(); // 내부 클래스 생성
    }

    class InClass{

        int inNum = 100;

        void inTest(){
            System.out.println("OutClass num = " +num + "(외부 클래스의 인스턴스 변수)");
            System.out.println("OutClass sNum = " + sNum + "(외부 클래스의 스태틱 변수)");
        }
    }

    public void usingClass(){
        inClass.inTest(); //내부 클래스 변수를 사용하여 메서드 호출하기
    }

    //정적 내부 클래스
    static class InStaticClass{        //정적 내부 클래스
        int inNum = 100;             //정적 내부 클래스의 인스턴스 변수
        static int sInNum = 200;     //정적 내부 클래스의 정적 변수

        void inTest() {    //정적 내부클래스의 일반메서드
           //num += 10;     //외부 클래스의 인스턴스 변수는 사용할 수 없다.
            System.out.println(inNum  + "정적 내부클래스의 인스턴스변수 사용");
            System.out.println(sInNum + "정적 내부클래스의 정적 변수 사용");
            System.out.println(sNum + "외부 클래스의 정적 변수 사용");
        }

        static void sTest(){  //정적 내부클래스의 정적 메소드
//            num += 10;   //외부 클래스의 인스턴스 변수 사용 X
//            inNum += 10; //내부 클래스의 인스턴스 변수 사용 X
            System.out.println(sNum +  "외부 클래스의 정적 변수 사용");
            System.out.println(sInNum +  "내부 클래스의 정적 변수 사용");

        }

    }


}

public class InnerTest {
    public static void main(String[] args) {
        //외부 클래스를 생성하지 않고 내부클래스 생성
        OutClass.InStaticClass sInClass = new OutClass.InStaticClass();
        //정적 내부클래스의 일반 메소드 호출
        sInClass.inTest();
        System.out.println();

        System.out.println("정적 내부 클래스의 스태틱 메소드 호출");
        OutClass.InStaticClass.sTest();



    }
}
