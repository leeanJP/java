package chap12.collection.arraylist;


import java.util.ArrayList;

class  MyStack{
    private ArrayList<String> arrayStack = new ArrayList<String>();

    //스택의 맨뒤에 요소를 추가
    public void push(String data){
        arrayStack.add(data);
    }

    public String pop(){
        int length = arrayStack.size();//ArrayList 저장된 유효한 자료의 개수
        if(length ==0){
            System.out.println("스택이 비었습니다.");
            return null;
        }
        return (arrayStack.remove(length-1));
        //맨뒤에 있는 자료를 반환하고 배열에서 제거

    }
}
public class StackTest {
    public static void main(String[] args) {
        MyStack stack = new MyStack();
        stack.push("A");
        stack.push("B");
        stack.push("C");

        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack);
    }

}
