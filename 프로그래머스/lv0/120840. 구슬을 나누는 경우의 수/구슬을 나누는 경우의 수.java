class Solution {
    public int solution(int balls, int share) {
        int answer = 0;
        double n = 1;
        double m = 1;
        
        if(balls == share) {
            answer=(int)1;
        } else {
            for(int i=0; i<=balls-share-1; i++){
                n*=(balls-i);
            }
            for(int i=balls-share; i>=1; i--) {
                m*=i;
            }
            answer = (int)Math.round(n/m);
        }   
        return answer;
    }
}
