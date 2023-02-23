class Solution {
    public boolean solution(String s) {
        if(s.length() != 4 && s.length() != 6) return false;
        for (int i=0; i<s.length(); i++) {
            if (s.charAt(i) < '0' || s.charAt(i) > '9') return false;
        }        
        return true;
    }
}

// 다른사람 풀이. **정규식 사용
import java.util.*;

class Solution {
  public boolean solution(String s) {
        if (s.length() == 4 || s.length() == 6) return s.matches("(^[0-9]*$)");
        return false;
  }
}
