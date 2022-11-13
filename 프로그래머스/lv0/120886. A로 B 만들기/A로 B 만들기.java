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

// char배열에 담아준 변수는 Arrays는 배열이 두개가 따로 생겨서 주소값이 당연히 달라져 equals를 사용하면 당연하게도 false가 나온다.
// String 새로운 객체를 생성해 char타입의 배열을 String으로 만들어 준 다음 주소값 비교를 해야한다!
