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

//Stream을 안썼다면
import java.util.*;

public class Solution {
    public int[] solution(int []arr) {
        ArrayList<Integer> tempList = new ArrayList<Integer>();
        int preNum = 10;
        for(int num : arr) {
            if(preNum != num)
                tempList.add(num);
            preNum = num;
        }       
        int[] answer = new int[tempList.size()];
        for(int i=0; i<answer.length; i++) {
            //.get(index)
            answer[i] = tempList.get(i).intValue();
        }
        return answer;
    }
}
