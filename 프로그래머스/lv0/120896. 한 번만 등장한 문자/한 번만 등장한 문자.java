class Solution {
    public String solution(String s) {
        String answer = "";
        int[] cnt = new int[26];
        
        for (int i = 0; i < 26; i++) {
            cnt[i] = 0;
        }
        
        for (int i = 0; i < s.length(); i++) {
            cnt[s.charAt(i) - 97] += 1;
        }
        
        for (int i = 0; i < 26; i++) {
            if (cnt[i] == 1) {
                answer += (char)(i + 97);
            }
        }
        return answer;
    }
}