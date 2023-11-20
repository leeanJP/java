package chap13.stream;

import java.util.ArrayList;
import java.util.List;

public class TravelTest {
    //세명의 고객을 arrayList추가하고
    //스트림을 생성해

    public static void main(String[] args) {
        TravelCustomer customer1 = new TravelCustomer("이순신", 40, 100);
        TravelCustomer customer2 = new TravelCustomer("김유신", 50, 100);
        TravelCustomer customer3 = new TravelCustomer("홍길동", 15, 50);

        List<TravelCustomer> customerList = new ArrayList<>();
        customerList.add(customer1);
        customerList.add(customer2);
        customerList.add(customer3);

        //1. 고객 명단을 출력
        System.out.println("=======고객 명단 추가된 순서대로 출력 ======");
        customerList.stream().map(c -> c.getName()).forEach(s -> System.out.println(s));
        //2. 여행의 총 비용 계산
        int total = customerList.stream().mapToInt(c-> c.getPrice()).sum();
        System.out.println("총 여행 비용은 " + total + "입니다.");
        //3. 고객 중 20세 이상인 사람의 이름을 정렬 출력
        System.out.println("==== 20세 이상 고객 명단을 정렬하여 출력 ====");
        customerList.stream().filter(c-> c.getAge() >=20)
                .map(c->c.getName()).sorted().forEach(s -> System.out.println(s));

    }
}
