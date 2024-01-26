package chap04;

import java.util.Arrays;

public class Solution {
    public static void main(String[] args) {
        int answer = 0;
        int n = 4;
        int[] lost = new int[]{3, 1};
        int[] reserve = new int[]{2, 4};
        answer = n -lost.length;
//        for(int i=0; i<lost.length; i++){
//            for(int j =0; j<reserve.length; j++){
//                if(lost[i] == reserve[j]){
//                    answer++;
//                    lost[i] = -1;
//                    reserve[j] = -1;
//                }
//            }
//        }

        for(int i=0; i<lost.length; i++){
            for(int j =0; j<reserve.length; j++){
                if(lost[i] == reserve[j]+1 || lost[i] == reserve[j]-1 ){
                    answer++;
                    lost[i] = -1;
                    reserve[j] = -1;
                }
            }
        }

        System.out.println(Arrays.toString(lost) + "//" + Arrays.toString(reserve)+ answer);



    }

}
