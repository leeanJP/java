package chap04;

public class Circle {
    int radius;
    String name;


    // public protected default private
    public double getArea(){
        return 3.14* radius * radius;
    }

    public static void main(String[] args) {
        Circle pizza; //변수 선언
        pizza = new Circle(); // 객체 생성
        pizza.radius = 10;
        pizza.name = "자바피자";

        double area = pizza.getArea();
        System.out.println(pizza.name +" 면적은 " +  area);



    }
}
