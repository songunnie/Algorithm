class Solution {
    public int solution(int chicken) {
        int answer = 0;
        int free = 0;
        
        while(chicken >= 10) {
            free = chicken/10;
            chicken -= 9*free;
            answer += free;
        }
        return answer;
    }
}