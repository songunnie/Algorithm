import java.util.Arrays;
class Solution {
    public int solution(int[] sides) {
        Arrays.sort(sides);
        return sides[2] < sides[0]+sides[1] ? 1 : 2;
    }
}
//0.45ms

// ㅁㅇㅇ님의 풀이.
import java.util.Arrays;
class Solution {
    public int solution(int[] sides) {
        int max = Arrays.stream(sides).max().getAsInt(); //최댓값 = 가장 긴 변
        int sum = Arrays.stream(sides).sum() - max; //합계 - 가장 긴변 = 나머지 두 변의 합
        return sum > max ? 1 : 2;
        
    }
}
//over 1.0ms ^^...너무 오래걸리는데요?
