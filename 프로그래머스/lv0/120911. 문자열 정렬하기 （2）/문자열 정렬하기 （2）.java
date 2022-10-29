import java.util.Arrays;
class Solution {
    public String solution(String my_string) {
        String answer = my_string.toLowerCase(); //String 객체 생성 -> 값 넣어줌 그러나 18번째 줄에선 이걸 그냥 return에서 선언하고 대입
        char[] charArr = answer.toCharArray(); // String 타입에서 Char Array로!
        Arrays.sort(charArr);
        
        return String.valueOf(charArr);
    }
}

//Better Solution
import java.util.*;
class Solution {
    public String solution(String my_string) {
        char[] c = my_string.toLowerCase().toCharArray(); // 함수 여러번 된다!
        Arrays.sort(c);
        return new String(c); //return 값에 바로 new로 String 객체 생성해서 c를 넣어주면 된다.
    }
}
