class Solution {
    public int solution(int n, int t) {
        for(int i=1; i<=t; i++) {
            n*=2;
        }
        return n;
    }
}

// 포인트는 제곱을 쓰는 방법! ‘ *= ‘ 이었다!
