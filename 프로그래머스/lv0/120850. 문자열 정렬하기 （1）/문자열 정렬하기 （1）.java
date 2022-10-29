import java.util.*;
class Solution {
    public int[] solution(String my_string) {
        String str = my_string.replaceAll("[^0-9]","");
        int[] answer = new int[str.length()];
        for(int i=0; i<=str.length()-1; i++) {
            answer[i] = (int)str.charAt(i) - 48;
            //48이 0의 아스키 코드인거임
        }
        
        Arrays.sort(answer); //.sort()의 반환 값이 void라 정렬만 해준다.
        //여기서 answer을 정렬해주고 return에는 변환한 answer을 넣어 값을 출력해주면된다.
        return answer;
    }
}