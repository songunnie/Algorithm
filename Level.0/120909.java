class Solution {
    public int solution(int n) {
        int num = (int)Math.sqrt(n);
        return (n%num == 0) ? 1 : 2;
    }
}

/*
제곱근(루트) 구하는 법! -> Math.sqrt()
결과가 double 이기 때문에 int로 형변환은 필수!
*/
