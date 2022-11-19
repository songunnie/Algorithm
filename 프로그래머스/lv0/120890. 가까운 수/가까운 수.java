import java.util.*;
class Solution {
    public int solution(int[] array, int n) {
        Arrays.sort(array);
        int answer = Math.abs(array[0]-n);
        int num = array[0];
        for(int i=1; i<=array.length-1; i++) {
            if(answer > Math.abs(array[i]-n)) {
                answer = Math.abs(array[i]-n);
                num=array[i];
            }
        }
        return num;
    }
}