package chap12.generics;

public class Powder extends Material{
    public void doPrinting(){
        System.out.println("파우더 재료로 출력합니다.");
    }

    public String toString(){
        return "재료는 Powder입니다.";
    }
}
