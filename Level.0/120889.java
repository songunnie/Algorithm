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
//over 1.0ms ^^...ㅁㅇㅇ님 너무 오래걸리는데요?

//가장 짧은 풀이
class Solution {
    public int solution(int[] sides) {
        int A = sides[0] + sides[1]; // sides[2]을 뺀 나머지 두변의 합
        int B = sides[0] + sides[2]; // sides[1]을 뺀 나머지 두변의 합
        int C = sides[1] + sides[2]; // sides[0]을 뺀 나머지 두변의 합
        
        if(A <= sides[2] || B <= sides[1] || C <= sides[0]) { // 하나라도 참이면, 두변의 합이 더 작아지는 거므로, 삼각형 안됨! false = 2
            return 2;
        } else {
            return 1;
        }
    }
}
//0.02ms
