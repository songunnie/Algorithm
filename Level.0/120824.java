class Solution {
    public int[] solution(int[] num_list) {
        int[] answer = new int[2];
        int even = 0;
        int odd = 0;
        for(int num : num_list) {
            if(num%2 == 0) {
                even ++;
            } else {
                odd ++;
            }
            answer[0] = even;
            answer[1] = odd;
        }
        return answer;
    }
}

// Better Solution
class Solution {
    public int[] solution(int[] num_list) {
        int[] answer = new int[2];

        for(int i = 0; i < num_list.length; i++)
            answer[num_list[i] % 2]++;

        return answer;
    }
}

// 나는 아직 건드리지도 못하는 코드....
import java.util.stream.IntStream;
import java.util.Arrays;

class Solution {
    public int[] solution(int[] numList) {
        return IntStream.of((int) Arrays.stream(numList).filter(i -> i % 2 == 0).count(), (int) Arrays.stream(numList).filter(i -> i % 2 == 1).count()).toArray();
    }
}
