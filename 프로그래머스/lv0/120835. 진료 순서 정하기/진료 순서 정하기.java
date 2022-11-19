import java.util.*;
class Solution {
    public int[] solution(int[] emergency) {
        int[] asc = new int[emergency.length];
        int[] answer = new int[emergency.length];
        
        for(int i=0; i<=emergency.length-1; i++) {
            asc[i]=emergency[i];
        }
        
        Arrays.sort(asc);
        
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


//.clone() 사용! 새로운 메모리 공간에 asc를 할당해준다.
import java.util.*;
class Solution {
    public int[] solution(int[] emergency) {
        int[] asc = emergency.clone();
        int[] answer = new int[emergency.length];
        
        Arrays.sort(asc);

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
