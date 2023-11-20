package chap13.lambda;

interface PrintString{
    void showString(String str1);
}

public class TestLambda {
    public static void main(String[] args) {
        PrintString lambdaStr = s -> System.out.println(s);
        //람다식을 인터페이스형 변수에 대입하고 변수를 사용해서 람다식 구현부를 호출
        lambdaStr.showString("hello lambda_1");

        //매서드의 매개변수를 람다식을 대입한 변수 전달
        showMyString(lambdaStr);

        PrintString reStr = returnString(); //변수로 반환받기
        reStr.showString("hello "); //메소드 호출

    }

    public static void showMyString(PrintString p){//매개변수를
                                //인터페이스 형으로 받음
        p.showString("hello lambda_2");
    }

    public static PrintString returnString(){
        //람다식을 반환하는 메서드
        return s -> System.out.println(s+ "world");
    }
}
