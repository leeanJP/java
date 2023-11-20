package chap13.lambda;

public class TestStringConcat {
    public static void main(String[] args) {
        String s1 = "hello";
        String s2 = "java";

//        StringConcatImpl concat1 = new StringConcatImpl();
//        concat1.makeString(s1,s2);

        StringConcat concat2 = (s, v) -> System.out.println(s+ "," + v);
        concat2.makeString(s1,s2);

        //람다식으로 메서드를 구현해서 호출하면
        //컴퓨터 내부에서는 익명 클래스가 생성되고
        //이를 통해서 익명객체가 생성된다
        StringConcat concat3 = new StringConcat() {
            @Override
            public void makeString(String s1, String s2) {
                System.out.println(s1+","+s2);
            }
        };

    }
}
