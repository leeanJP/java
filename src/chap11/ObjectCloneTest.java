package chap11;

class Point {
    int x;
    int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

}

class Circle implements Cloneable { //객체를 복제해도 된다는 의미
    Point point;
    int radius;

    Circle(int x, int y , int radius){
        this.radius = radius;
        point = new Point(x,y);

    }

    public String toString(){
        return "원점은 " + point +  "이고 " + "반지름은 " + radius + "입니다.";
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        //clone() 메소드를 사용할 때 발생할 수 있는 오류를 예외 처리함
        return super.clone();

    }

}



public class ObjectCloneTest {
    public static void main(String[] args) throws CloneNotSupportedException{
        Circle circle = new Circle(10, 20, 30);
        Circle copyCircle = (Circle) circle.clone();
        copyCircle.radius = 20;
        System.out.println(circle);
        System.out.println(copyCircle);

        System.out.println(System.identityHashCode(circle));
        System.out.println(System.identityHashCode(copyCircle));
    }
}
