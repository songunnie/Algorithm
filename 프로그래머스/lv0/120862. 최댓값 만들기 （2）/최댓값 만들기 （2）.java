class Solution {
    public int solution(int[] numbers) {
        int num = numbers[0]*numbers[1];
        for(int i=0; i<=numbers.length-1; i++) {
            for(int j=i+1; j<=numbers.length-1; j++) {
                if(num < numbers[i]*numbers[j]) {
                    num = numbers[i]*numbers[j];
                }
            }
        }
        return num;
    }
}

//Arrays.sort()와 Math class를 활용한 풀이.
import java.util.*;

class Solution {
    public int solution(int[] numbers) {
        int answer = 0;

        Arrays.sort(numbers);

        int edge1 = numbers[0]*numbers[1];
        int edge2 = numbers[numbers.length-2]*numbers[numbers.length-1];

        answer = Math.max(edge1,edge2);
        return answer;
    }
}
