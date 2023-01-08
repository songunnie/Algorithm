import java.util.*;
class Solution {
    public long solution(long n) {
        long answer = 0;
        String[] sArr = String.valueOf(n).split("");
        Integer[] arr = new Integer[sArr.length];

        for(int i=0; i<=sArr.length-1; i++) {
            arr[i] = Integer.parseInt(sArr[i]);
        }
        
        Arrays.sort(arr, Collections.reverseOrder());
        
        String str = "";
        for(int a : arr) {
            str += String.valueOf(a);
        }
        
        answer = Long.parseLong(str);
        return answer;
    }
}