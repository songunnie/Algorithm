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

//이렇게 풀게 되는 그 날 까지!
import java.util.*;

class Solution {
  public long solution(long n) {
        String[] list = String.valueOf(n).split("");
        Arrays.sort(list);

        StringBuilder sb = new StringBuilder();
        for (String aList : list) sb.append(aList);

        return Long.parseLong(sb.reverse().toString());
  }
}
