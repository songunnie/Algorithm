class Solution {
    public long solution(long price, long money, long count) {
        long answer = 0;
        
        for(int i=1; i<=count; i++) {
            money -= price * i;
        }
        
        if(money < 0) {
            answer = money*(-1L);
        } else {
            answer = 0;
        }
        return answer;
    }
}