package chap12;

import java.util.HashSet;
//출력결과
//100:홍길동, 200:강감찬, 300:이순신, 400:정약용
//위 출력결과가 나오도록 Student 클래스를 구현하시오.

public class Ex01 {
    public static void main(String[] args) {
        HashSet<Student> set = new HashSet<Student>();

        set.add(new Student("100", "홍길동"));
        set.add(new Student("200", "강감찬"));
        set.add(new Student("300", "이순신"));
        set.add(new Student("400", "정약용"));
        set.add(new Student("100", "송중기"));

        System.out.println(set);
    }
}
