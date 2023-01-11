import java.util.*;
class Solution {
    public long solution(int a, int b) {
        long answer = 0;
        int[] arr = {a,b};
        Arrays.sort(arr);
        
        for(int i=arr[0]; i<=arr[1]; i++) {
            answer += i;
        }
        
        return answer;
    }
}

//등차수열의 합 공식
class Solution {

    public long solution(int a, int b) {
        return sumAtoB(Math.min(a, b), Math.max(b, a));
    }

    private long sumAtoB(long a, long b) {
        return (b - a + 1) * (a + b) / 2;
    }
}
