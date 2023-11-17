package chap12;

import java.util.*;

public class HashMapNation {
    public static void main(String[] args) {
        HashMap<String, Integer> nations = new HashMap<String, Integer>();
        Scanner sc = new Scanner(System.in);
        System.out.println("나라 이름과 인구를 5개 입력하시오 (예: Korea 5000)");
        for(int i=0; i<5; i++){
            System.out.print("나라이름 , 인구 >>");
            String nation = sc.next();       //입력받은 나라이름과 인구수 변수 저장
            int population = sc.nextInt();
            nations.put(nation, population);
        }
        int bigPopulation = 0; //제일 많은 인구
        String bigNation = ""; //제일 많은 인구의 나라
        Set<String> names = nations.keySet(); Iterator<String> ir = names.iterator();
        while (ir.hasNext()){
            String name = ir.next(); //키, 나라이름
            int n = nations.get(name); //인구
            if(bigPopulation < n){
                bigPopulation = n;  bigNation = name;
            }
        }
        System.out.println("제일 인구가 많은 나라는 (" + bigNation + ", " + bigPopulation + ")");
        sc.close();
    }
}
