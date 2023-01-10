class Solution {
    public int solution(int n) {
        int answer = 0;
        int x = n-1;
        
        for(int i=2; i<=x; i++) {
            if(x%i==0) {
                answer = i;
                break;
            }
        }
        return answer;
    }
}