import java.util.Arrays;
class Solution {
    public String solution(String my_string) {
        String answer = my_string.toLowerCase();
        char[] charArr = answer.toCharArray(); // String to Char Array
        Arrays.sort(charArr);
        
        return String.valueOf(charArr);
    }
}