class Solution {
    public int solution(double num) {
        int answer = 0;
        int cnt = 0;
        while(num != 1) {
            if(num%2==0) {
                num /= 2;
                cnt++;
            } else {
                num = (num*3)+1;
                cnt++;
            }
        } 
        
        answer = cnt <= 500 ? cnt : -1;
        return answer;
    }
}