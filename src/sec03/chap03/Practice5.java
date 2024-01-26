package sec03.chap03;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;


public class Practice5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] a = new int[10]; // 배열 생성
        System.out.println("정수 10개 입력 >>");

        for(int i=0; i<a.length; i++){
            a[i] = sc.nextInt();
        }


//        Arrays.sort(a);

        for(int i = 0;  i<a.length; i++){
            for(int j = 0; j<a.length -i -1; j++){
                if(a[j] > a[j+1]){
                    int tmp1 = a[j+1];
                    a[j+1] = a[j];
                    a[j] = tmp1;
                    System.out.println("변경 후 :"+ Arrays.toString(a));
                }
            }
        }
//        for(int i=0; i<a.length; i++){
//            for(int j=i; j<a.length; j++){
//                if(a[i] > a[j]){
//                    int tmp = a[i];
//                    a[i] = a[j];
//                    a[j] = tmp;
//                    System.out.println("변경 후 :"+ Arrays.toString(a));
//
//                }
//            }
//        }

        for(int i : a){
            System.out.println(i);
        }

    }
}
