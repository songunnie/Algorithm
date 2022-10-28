class Solution {
    public int solution(int n) {
        int cnt = 0;
        for(int i=1; i<=n; i++) {
            if(n%i == 0) {
                cnt++;
            }
        }
        return cnt;
    }
}

//ArrayList 사용한 풀이
import java.util.*;

class Solution {
    public int solution(int n) {
        int answer = 0;
        List<Integer> list = new ArrayList<>();

        for(int i=1; i<=n; i++){
            if(n%i==0) list.add(i);
        }
        answer = list.size();
        return answer;
    }
}

//IntStream 이용한 풀이
import java.util.stream.IntStream;

class Solution {
    public int solution(int n) {
        return (int) IntStream.rangeClosed(1, n).filter(i -> n % i == 0).count();
    }
}
