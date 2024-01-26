package sec03.chap04;

public class Circle {
    int radius; // 원의 반지름 필드
    String name; // 원의 이름 필드

    public Circle() {
        radius = 1; //초기값은 1
        name= "";  // null
    }

    public Circle(int r , String n){
        radius = r;
        name = n;
    }

    public double getArea() { // 멤버 메소드
        return 3.14*radius*radius;
    }

    public static void main(String[] args) {
        Circle pizza = new Circle(10, "자바피자");
        double area = pizza.getArea();
        System.out.println(pizza.name+"의 면적은 "+ area);

        Circle donut = new Circle();
        donut.name = "도넛피자";
        area = donut.getArea();
        System.out.println(donut.name + "의 면적은 " + area);

//        System.out.println(donut.name + "의 면적은 " + area);
    }
}
