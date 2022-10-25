class Solution {
    public int[] solution(int n) {
        int num=1;
        int[] answer = new int[(n+1)/2];
        
        for(int i=0; i<=answer.length-1; i++) {
            answer[i] = num;
            num+=2;
        }
        // answer[0] = 1;
        // answer[1] = 1+2;
        // answer[2] = 1+2+2;
        // answer[3] = 1+2+2+2;
        return answer;
    }
}

//map을 활용한 풀이
import java.util.List;
import java.util.ArrayList;

class Solution {
    public int[] solution(int n) {
        List<Integer> answer = new ArrayList<>();
        for(int i=1; i<=n; i++){
            if(i % 2 == 1){
                answer.add(i);
            }
        }
        return answer.stream().mapToInt(x -> x).toArray();
    }
}
