class Solution {
    public int[] solution(int money) {
        int[] answer = new int[2];
        answer[0] = money/5500;
        answer[1] = money%5500;
        return answer;
    }
}
//0.2~3ms

//Better Solution -> 0.1~2ms
class Solution {
    public int[] solution(int money) {
        return new int[] { money / 5500, money % 5500 };
    }
}

//Another Solution -> 0.2~3ms
import java.util.*;

class Solution {
    public ArrayList solution(int money) {
        ArrayList<Integer> answer = new ArrayList<>();

        answer.add(money/5500);
        answer.add(money%5500);

        return answer;
    }
}
