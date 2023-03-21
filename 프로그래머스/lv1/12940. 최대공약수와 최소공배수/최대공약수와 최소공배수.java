class Solution {
    public int[] solution(int n, int m) {
        int[] answer = new int[2];
        //밑에서 만든 getGCD 메서드의 조건이 큰수와 작은수 비교이기 때문에 따로 정의
        int big = Math.max(n,m);
        int small = Math.min(n,m);
        
        int gcd = getGCD(big, small);
        int lcm = big*small / gcd;
        
        answer[0] = gcd;
        answer[1] = lcm;
        return answer;
    }
    
    public int getGCD(int a, int b) {
        if(a % b == 0) {
            return b;
        }
        return getGCD(b , a%b);
    }
}