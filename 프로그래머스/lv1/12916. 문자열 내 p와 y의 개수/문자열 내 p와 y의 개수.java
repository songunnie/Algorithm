class Solution {
    boolean solution(String s) {
        boolean answer = true;
        
        int cntP = 0;
        int cntY = 0;
        
        String str = s.toLowerCase();
        
        for(int i=0; i<=str.length()-1; i++) {
            if(str.charAt(i) == 'p') {
                cntP++;
            } else if(str.charAt(i) == 'y') {
                cntY++;
            }
        }
        
        answer = (cntP == cntY) ? true : false;
        return answer;
    }
}