package chap04;

public class Ex01 {
    public static void main(String[] args) {
        String str1 = "%s의 둘레는 반지름 X %d X %f입니다.";

        String circle = "원";
        int two = 2;
        double PI = 3.14;

        //  💡 formatted : 주어진 형식에 따라 문자열 생성
        //  ⭐️ 13+버전에 추가됨. 편의상 강의에서 많이 사용할 것
        String str2 = str1.formatted(circle, two, PI);

        //  💡 이전 버전에서의 방식. 실무에서 사용하려면 기억
        String str3 = String.format(str1, circle, two, PI);

        //  ⭐️ 시스템의 printf 메소드 : String.format과 같은 형식으로 출력
        //  줄바꿈을 하지 않으므로 직접 넣어줘야 함
//        System.out.printf("%s의 둘레는 반지름 X %d X %f입니다.%n", circle, two, PI);
//        System.out.printf(str3 +"%n");
//        System.out.printf(str3 +"%n");

        int intNum = 3;
        //modifyIntArg(intNum);

        int[] intNums = {1, 2, 3};
        //  배열은 참조형이지만 그 안의 값들은 원시형
       // modifyIntArg(intNums[0]);

        //  참조형인 배열 자체를 인자로 사용
       modifyAryElem(intNums);
    }

    static void modifyIntArg (int num) {
        System.out.printf("수정 전: %d%n", num++);
        System.out.printf("수정 후: %d%n", num);
    }
    static  void modifyAryElem (int[] ary) {
        System.out.printf("수정 전: %d%n", ary[1]++);
        System.out.printf("수정 후: %d%n", ary[1]);
    }
}
