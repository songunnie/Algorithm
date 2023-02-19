class Solution {
    public int solution(int n) {
        String ternary = Integer.toString(n,3); //10 -> 3진수로
        StringBuilder sb = new StringBuilder(ternary);
        String reverse = sb.reverse().toString();
        int decimal = Integer.parseInt(reverse, 3);
        
        return decimal;
    }
}