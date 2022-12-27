import java.math.*;

class Solution {
    public int[] solution(int denum1, int num1, int denum2, int num2) {
        int[] answer = new int[2];  
        int denum = (denum1*num2) + (denum2*num1);
        int num = num1 * num2;
        
        BigInteger b1 = BigInteger.valueOf(denum);
        BigInteger b2 = BigInteger.valueOf(num);
        BigInteger b3 = b1.gcd(b2);
        int gcd = b3.intValue();
        
        answer[0] = denum/gcd;
        answer[1] = num/gcd;
        return answer;
    }
}