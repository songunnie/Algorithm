import java.util.Arrays;
class Solution {
    public int solution(String before, String after) {
        char[] cBe = before.toCharArray();
        char[] cAf = after.toCharArray();
        
        Arrays.sort(cBe);
        Arrays.sort(cAf);
        
        String be = new String(cBe);
        String af = new String(cAf);
        
        return be.equals(af) ? 1:0;
    }
}