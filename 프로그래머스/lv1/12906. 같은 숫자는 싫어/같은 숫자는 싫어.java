import java.util.*;

public class Solution {
    public int[] solution(int []arr) {
        List<Integer> arrList = new ArrayList<Integer>();
        int a = -1;
        for(int i=0; i<=arr.length-1; i++) {
            if(arr[i] != a) {
                arrList.add(arr[i]);
                a = arr[i];
            }
        }

        return arrList.stream().mapToInt(i->i).toArray();
    }
}