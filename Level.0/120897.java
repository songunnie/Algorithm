class Solution {
    public int[] solution(int n) {
        int idx = 0;
        for(int i=1; i<=n; i++) {
            if((n%i)==0) {
                idx++;
            }
        }
        
        int num = 0;
        int[] answer = new int[idx];
        for(int i=1; i<=n; i++) {
            if((n%i)==0) {
                answer[num] = i;
                num++;
            } 
        }
        return answer;
    }
}

