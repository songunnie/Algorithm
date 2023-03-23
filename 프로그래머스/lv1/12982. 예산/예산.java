import java.util.*;

class Solution {
    public int solution(int[] d, int budget) {
        int answer = 0;
        int sum = 0;
        Arrays.sort(d);
        
        for (int dNum : d) {
            budget -= dNum;
            if (budget < 0) break;
            answer++;
        }
        
        return answer;
    }
}