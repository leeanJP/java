package chap12.generics;

public class Plastic extends Material {
    public void doPrinting(){
        System.out.println("플라스틱 재료로 출력합니다.");
    }

    public String toString(){
        return "재료는 플라스틱입니다.";
    }
}
