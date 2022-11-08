class Solution {
    public int solution(int[] numbers) {
        int num = numbers[0]*numbers[1];
        for(int i=0; i<=numbers.length-1; i++) {
            for(int j=0; j<i; j++) {
                if(num < numbers[i]*numbers[j]) {
                    num = numbers[i]*numbers[j];
                }
            }
        }
        return num;
    }
}

// Arrays.sort();
import java.util.Arrays;

class Solution {
    public int solution(int[] numbers) {
        Arrays.sort(numbers);
        return numbers[numbers.length-1] * numbers[numbers.length-2] < numbers[0] * numbers[1] ?
            numbers[0] * numbers[1] : numbers[numbers.length-1] * numbers[numbers.length-2];
    }
}
