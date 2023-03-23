import java.util.*;

class Solution {
    public int solution(int[] d, int budget) {
        int answer = 0;
        int sum = 0;
        Arrays.sort(d);
        
        for(int dNum : d) {
            if(sum+dNum <= budget) {
                sum += dNum;
                answer ++;
            }
        }

        return answer;
    }
}