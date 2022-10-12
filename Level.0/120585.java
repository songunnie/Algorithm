class Solution {
    public int solution(int[] array, int height) {
        int cnt = 0;
        for(int a : array) {
            if(a > height) {
                cnt+=1;
            }
        }
        return cnt;
    }
}
