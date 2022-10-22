// 내 풀이! -> 0.01 ms
class Solution {
    public int solution(int[] numbers) {
        int answer = numbers[0]*numbers[1];
        for(int i=0; i<=numbers.length-1; i++) {
            for(int j=1; j<=numbers.length-1; j++) {
                if(i<j && numbers[i]*numbers[j] > answer) {
                    answer = numbers[i]*numbers[j];
                }
            }
        }
        // [0][1] 
        // [0][2] [1][2]
        // [0][3] [1][3] [2][3]
        // [0][4] [1][4] [2][4] [3][4]
        // i = 0 일 때, j=는 1 부터 시작하고, i < j 의 조건을 달아서 중복되는 값을 피했다.
        return answer;
    }
}

//Another Solution
import java.util.Arrays;
class Solution {
    public int solution(int[] numbers) {
        int answer = 0;
        Arrays.sort(numbers);
        
        answer = numbers[numbers.length-1]*numbers[numbers.length-2];
        return answer;
    }
}
//0.34ms 가 나온다! 

