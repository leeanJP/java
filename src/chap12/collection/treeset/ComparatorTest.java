package chap12.collection.treeset;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

class MyCompare implements Comparator<String>{

    @Override
    public int compare(String s1 ,String s2){
        //내림차순 정렬
        return (s1.compareTo(s2)) * -1;
    }
}

public class ComparatorTest {
    public static void main(String[] args) {
        //TreeSet 생성자의 매개변수로 정렬방식을 지정
        Set<String> set = new TreeSet<String>(new MyCompare());

        set.add("bbb");
        set.add("aaa");
        set.add("ccc");
        System.out.println(set);
    }
}
