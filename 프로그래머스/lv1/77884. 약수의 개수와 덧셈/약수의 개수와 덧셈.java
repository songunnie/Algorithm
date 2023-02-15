class Solution {
    public int solution(int left, int right) {
        int answer = 0;
    
        for(int n=left; n<=right; n++) {
            int cnt = 0;
            for(int i=1; i*i<=n; i++) {
                if(i*i == n) {
                    cnt++;
                } else if(n%i == 0) {
                    cnt +=2;
                } 
            }
            answer = (cnt % 2 == 0) ? (answer += n) : (answer -= n);
        }
        
        return answer;
    }
}