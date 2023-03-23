class Solution {
    public String solution(String s) {
        String answer = "";
        String[] arr = s.split("");
        //'try',' ','hello',' ','world'
        int idx = 0;
        for(String a : arr) {
            idx = a.contains(" ") ? 0 : idx+1;
            answer += idx % 2 == 0 ? a.toLowerCase() : a.toUpperCase();
        }
        return answer;
    }
}