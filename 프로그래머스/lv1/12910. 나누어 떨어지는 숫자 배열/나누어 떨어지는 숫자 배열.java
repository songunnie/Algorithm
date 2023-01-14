import java.util.*;
class Solution {
    public int[] solution(int[] arr, int divisor) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        
        Arrays.sort(arr);
        
        for(int a : arr) {
            if(a % divisor == 0) {
                list.add(a);
            } 
        }
        
        if(list.size()==0) {
            list.add(-1);
        }
        
        //ArrayList<>를 int[]로
        int[] answer = list.stream()
                .mapToInt(Integer::intValue)
                .toArray();
        
        return answer;
    }
}