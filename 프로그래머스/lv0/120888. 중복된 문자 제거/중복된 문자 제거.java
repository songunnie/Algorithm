class Solution {
    public String solution(String my_string) {
        String answer = "";
        
        for(int i=0; i<=my_string.length()-1; i++) {
            if(my_string.indexOf(my_string.charAt(i))==i) {
                answer += my_string.charAt(i);
            }
        }
        return answer;
    }
}