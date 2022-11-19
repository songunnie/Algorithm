// import java.util.*;
// class Solution {
//     public int[] solution(int[] emergency) {
//         int[] asc = emergency.clone();
//         int[] answer = new int[emergency.length];
        
//         Arrays.sort(asc);

//         for(int i=0; i<=emergency.length-1; i++) {
//             for(int j=0; j<=emergency.length-1; j++) {
//                 if(asc[i]==emergency[j]) {
//                     answer[j]=emergency.length-i;
//                 }
//             }
//         }
//         return answer;
//     }
// }

import java.util.*;
class Solution {
    public int[] solution(int[] emergency) {
        int[] asc = emergency;
        int[] answer = new int[emergency.length];
       
        Arrays.sort(asc);
        System.out.println(emergency[0]);
        System.out.println(emergency[1]);
        System.out.println(emergency[2]);
        
        System.out.println(asc[0]);
        System.out.println(asc[1]);
        System.out.println(asc[2]);
        for(int i=0; i<=emergency.length-1; i++) {
            for(int j=0; j<=emergency.length-1; j++) {
                if(asc[i]==emergency[j]) {
                    answer[j]=emergency.length-i;
                }
            }
        }
        return answer;
    }
}