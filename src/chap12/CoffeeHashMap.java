package chap12;

import java.util.HashMap;
import java.util.Scanner;

public class CoffeeHashMap {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<String, Integer>();
        map.put("에스프레소", 2000);map.put("아메리카노", 2500);
        map.put("카푸치노", 3000);map.put("카페라떼", 3500);
        System.out.println("에스프레소, 아메리카노, 카푸치노, 카페라떼 있습니다.");
        Scanner sc = new Scanner(System.in);
        while (true){
            System.out.println("주문 >>");
            String coffee = sc.next();
            if(coffee.equals("그만")){break;}
            Integer price = map.get(coffee);
            if(price == null){
                System.out.println("그런 메뉴는 없습니다.");
            }else {System.out.println(coffee + "는 " + price + " 입니다.");}
        }
        sc.close();
    }
}
