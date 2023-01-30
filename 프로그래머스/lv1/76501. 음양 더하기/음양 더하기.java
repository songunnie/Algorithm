class Solution {
    public int solution(int[] absolutes, boolean[] signs) {
        int answer = 0;

        for(int i=0; i<= absolutes.length-1;i++) {
            if(signs[i] == true) {
                absolutes[i] = absolutes[i];
                answer += absolutes[i];
            } else if(signs[i] == false) {
                absolutes[i] = (-1)*absolutes[i];
                answer += absolutes[i];
            }
        }
        return answer;
    }
}