import java.util.*;
import java.util.stream.Stream;

public class Solution {
    public int solution(int n) {
        int answer = 0;
        int[] digits = Stream.of(String.valueOf(n).split("")).mapToInt(Integer::parseInt).toArray();
        
        for(int d : digits) {
            answer += d;
        }
        
        return answer;
    }
}