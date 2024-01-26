package sec03.chap04;

public class Cat {
    private String name;
    public static final String FOOD = "고양이 사료";
    private static int count = 0;
    public Cat(String name){
        this.name = name;
        count++;
    }

    @Override
    public String toString(){
        return "Cat [ name = " + name + "]";
    }

    public static int getCount() {
        return count;
    }
}
