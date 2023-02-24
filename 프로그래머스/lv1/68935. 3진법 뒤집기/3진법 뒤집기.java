class Solution {
    public int solution(int n) {
        String ternary = Integer.toString(n,3); //10진법 -> 3진법으로
        StringBuilder sb = new StringBuilder(ternary); //reverse() 사용을 위해
        String reverse = sb.reverse().toString(); 
        int decimal = Integer.parseInt(reverse, 3); //3진법을 10진법으로
        
        return decimal;
    }
}