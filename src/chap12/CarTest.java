package chap12;
//아래의 결과가 true true false가 나오도록
//HashMap을 사용하여 CarFactory클래스를 구현해보세요.
public class CarTest {
    public static void main(String[] args) {
        CarFactory factory = CarFactory.getInstance();
        Car sonata1 = factory.createCar("연수 차");
        Car sonata2 = factory.createCar("연수 차");
        System.out.println(sonata1 == sonata2); //true
        Car avante1 = factory.createCar("승연 차");
        Car avante2 = factory.createCar("승연 차");
        System.out.println(avante1 == avante2); //true
        System.out.println(sonata1 == avante1); //false


    }
}
