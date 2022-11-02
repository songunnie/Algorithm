class Solution {
    public String solution(int age) {
        char[] c = String.valueOf(age).toCharArray();
        
        for(int i = 0; i<= c.length-1; i++) {    
            c[i] = (char) (c[i] + 49);
        }
        return String.valueOf(c);
    }
}