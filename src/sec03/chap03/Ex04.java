package sec03.chap03;

public class Ex04 {
    public static void main(String[] args) {
//                String str1 = "문자열에 "큰따옴표가" 안 들어가요";
//                String str2 = "엔터도 안 들어가요.
//                "못 믿겠으면 넣어봐.";
        String str = "문자열에 \"큰따옴표\"도,\n엔터도 넣을 수 있다고?";
        System.out.println(str);

        String table = "언어\t\t종류\t\t\t\t자료형\nJava\tcompiled\t\t정적\nPython\tinterpreted\t\t동적";
        System.out.println(table);

        char singleQuote = '\'';
        System.out.println(singleQuote);

        String path = "C:\\Document\\MyCodings";
        System.out.println(path);

//        int int1 = "".length();
//        int int2 = "헬로".length();
//        int int3 = "Hello".length();
//        int int4 = "김수한무 거북이와 두루미".length();

        String str1 = "";
        String str2 = " \t\n";
        // "     "
        int int1 = str1.length();
        int int2 = str2.length();

        //  💡isEmpty : 문자열의 길이가 0인지 여부
        boolean bool1 = str1.isEmpty();
        boolean bool2 = str2.isEmpty();

        //  💡isBlank : 공백(white space)을 제외한 문자열의 길이가 0인지 여부
        boolean bool3 = str1.isBlank();
        boolean bool4 = str2.isBlank();

        String str3 = "\t\0   에 네 르 기 파!! \n";

        //  💡 trim : 앞뒤의 공백(white space) 제거
        String str4 = str3.trim();

        //  변수 그 자체에 적용하기
        //  - 문자열은 불변 : 변수가 가리키는 종이를 바꾸는 것
        //str3 = str3.trim();
    }

}
