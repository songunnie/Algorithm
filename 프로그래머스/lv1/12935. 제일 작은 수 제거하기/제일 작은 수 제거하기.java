import java.util.*;
class Solution {
    public int[] solution(int[] arr) {
        int[] answer = {};
        int i = 0;
        //최소값 먼저 찾고
        int min = Arrays.stream(arr).min().getAsInt();
        
        if(arr.length > 1) {
            answer = new int[arr.length-1];
            for(int a : arr) {
                if(a != min) {
                    answer[i] = a;
                    i++;
                }
            }
        } else {
            answer = new int[1];
            answer[0] = -1;
        }
        
        return answer;
    }
}