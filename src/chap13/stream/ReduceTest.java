package chap13.stream;

import java.util.Arrays;
import java.util.function.BinaryOperator;

class CompareString implements BinaryOperator<String>{//BinaryOperator 구현한 클래스 정의

    @Override
    public String apply(String s1, String s2) { //reduce 메소드가 호출될때 불리는 메서드
                                            //두 문자열 길이를 비교
        if(s1.getBytes().length >= s2.getBytes().length ) return s1;
        else return s2;
    }
}

public class ReduceTest {
    public static void main(String[] args) {
        String[] greetings = {"안녕하세요~~~~~", "hello~" , "Good Morning" , "반갑습니다."};

        //BinaryOperator를 구현한 클래스 사용
        String str = Arrays.stream(greetings).reduce(new CompareString()).get();
        System.out.println(str);

        //람다식을 직접 구현하는 방식
        System.out.println(Arrays.stream(greetings).reduce("",(s1,s2) -> {
           if(s1.getBytes().length >= s2.getBytes().length){
               return s1;
           }else return s2;
        }));

    }
}
