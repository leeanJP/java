package sec03.chap01;

public class EqualsTest {
    public static void main(String[] args) {
        String a = "JAVA";
        String b = "JAVA";
        String c = new String("JAVA");
        String d = new String("JAVA");

        System.out.println(a==b);
        System.out.println(b==c);
        System.out.println(c==d);

        System.out.println(a.equals(b));
        System.out.println(b.equals(c));
    }
}
