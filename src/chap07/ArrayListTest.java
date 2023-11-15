package chap07;

import java.util.ArrayList;

public class ArrayListTest {
    public static void main(String[] args) {
        ArrayList<Book> library = new ArrayList<Book>(); // ArrayList 선언

        //add() 메소드로 요소 값 추가
        library.add(new Book("태백산맥", "조정래"));
        library.add(new Book("데미안", "헤르만 헤세"));
        library.add(new Book("토지", "박경리"));
        library.add(new Book("어린왕자", "생텍쥐페리"));

        //배열에 추가된 개수만큼 출력
        for(int i=0; i<library.size(); i++){
            Book book = library.get(i);
            book.showBookInfo();
        }

        System.out.println("=========향상 for문 사용");

        for(Book book : library){
            book.showBookInfo();
        }



    }
}
