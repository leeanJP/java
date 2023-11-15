package chap12.generics;

//자료형 매개변수를 두 개 사용하는 클래스
public class Point<T , V> {
    T x;
    V y;

    Point(T x , V y){
        this.x = x;
        this.y = y;
    }

    public T getX(){
        return x;
    }
    public  V getY(){
        return y;
    }


}
