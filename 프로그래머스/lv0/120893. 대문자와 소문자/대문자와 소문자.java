import java.util.*;
class Solution {
    public String solution(String my_string) {
        char[] c = my_string.toCharArray();
        for(int i=0; i<=my_string.length()-1; i++) {
            if(c[i] >= 65 && c[i] <= 90) {
                c[i] += 32;
            } else if(c[i] >= 97 && c[i] <= 122) {
                c[i] -= 32;
            }
        }
        return new String(c);
    }
}