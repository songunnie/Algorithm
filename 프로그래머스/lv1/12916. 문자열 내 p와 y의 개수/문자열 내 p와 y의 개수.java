class Solution {
    boolean solution(String s) {
        boolean answer = true;
        
        int cntP = 0;
        int cntY = 0;
        
        char[] cArr = s.toLowerCase().toCharArray();
        for(char c : cArr) {
            if(c == 'p') {
                cntP++;
            } else if(c == 'y') {
                cntY++;
            }
        }
        
        answer = (cntP == cntY) ? true : false;
        return answer;
    }
}