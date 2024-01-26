package sec03.chap04;

public class CatEx {

    public static void main(String[] args) {
        //클래스 변수는 클래스.변수명
        System.out.println(Cat.getCount());
        Cat cat1 = new Cat("라이");
        System.out.println(Cat.getCount());
        Cat cat2 = new Cat("로이");

        System.out.println(cat1);
        System.out.println(Cat.FOOD);

    }
}
