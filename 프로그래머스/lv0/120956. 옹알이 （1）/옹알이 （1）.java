class Solution {
    public int solution(String[] babbling) {
        int answer = 0;

        for(int i =0; i < babbling.length; i++) {
            babbling[i] = babbling[i].replaceFirst("aya", "1");
            babbling[i] = babbling[i].replaceFirst("woo", "1");
            babbling[i] = babbling[i].replaceFirst("ye", "1");
            babbling[i] = babbling[i].replaceFirst("ma", "1");
            babbling[i] = babbling[i].replace("1", "");
            
            if(babbling[i].isEmpty()) {
                answer = answer + 1;
            }
        }

        return answer;
    }
}