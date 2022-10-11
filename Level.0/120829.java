class Solution {
    public int solution(int angle) {
        int answer = 0;
        if (0<angle && angle<90) {
            return 1;
        } else if (90==angle) {
            return 2;
        } else if (90<angle && angle<180) {
            return 3;
        } else if (180==angle) ; {
            return 4;
        }
    }
}

// 다른 풀이 방법
// {}를 안쓰고 한줄에 하는 방법도 있었음!
class Solution {
    public int solution(int angle) {
        if (angle > 0 && angle < 90) return 1;
        else if (angle == 90) return 2;
        else if (angle > 90 && angle < 180) return 3;
        else return 4;
    }
}

// 좋은 풀이 방법
// 삼항연산자 식으로 계속 이렇게 쓸 수 있다니! 알면서도 발상에 놀랐다.
class Solution {
    public int solution(int angle) {
        return angle == 180 ? 4 : angle < 90 ? 1 : angle == 90 ? 2 : angle > 90 ? 3 : 0;
    }
}
