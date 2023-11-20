package chap13.stream;

import java.util.Arrays;

public class IntArrayTest {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        // 합계 반환
        int sumVal = Arrays.stream(arr).sum();
        //배열의 요소 개수 반환
        int cnt = (int) Arrays.stream(arr).count();

//        System.out.println(sumVal);
//        System.out.println(cnt);

        System.out.println(Arrays.stream(arr).reduce(0,(a,b) -> a+b));
//        for(int i=0; i<arr.length; i++){
//            System.out.println(arr[i]);
//        }
        //Arrays.stream(arr).forEach(n -> System.out.println(n));
        //스트림 생성부분     //요소를 하나씩 꺼내어 출력하는 기능


    }
}
