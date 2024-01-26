package sec03.chap03;

public class Ex08 {
    public static void main(String[] args) {
        //  💡 concat : 문자열을 뒤로 이어붙임
        String str_a1 = "슉-";
        String str_a2 = "슈슉-";
        String str_a3 = "슈슈슉-";

        String str_a4 = str_a1 + str_a2 + str_a3;

        String str_a5 = str_a1.concat(str_a2);

        //  ⭐️ 메서드 체이닝
        String str_a6 = str_a1
                .concat(str_a2)
                .concat(str_a3)
                .concat(str_a4)
                .concat(str_a5);


        String str_b1 = "ABC";

        //  1. concat에는 문자열만 이어붙일 수 있음
        String str_b2 = str_b1 + true + 1 + 2.34 + '가';
        String str_b3 = str_b1
                //  .concat(true)
                //  .concat(1)
                //  .concat(2.34)
                //  .concat('가')
                ;

        int[] intArray = {1,2,3,4,5};
        int[] intArr = new int[5];
        intArr[0] = 1;

        System.out.println(intArray[0]);
        System.out.println(intArr[0]);

    }
}
