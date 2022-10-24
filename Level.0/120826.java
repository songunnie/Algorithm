class Solution {
    public String solution(String my_string, String letter) {
        return my_string.replaceAll(letter,"");
    }
}

//Hard Coding
class Solution {
    public String solution(String my_string, String letter) {
        String answer = "";
        char c = letter.charAt(0);
        for(int i=0; i<my_string.length(); i++){
            char temp = my_string.charAt(i);
            if(temp==c) continue;
            answer+=temp;

        }

        return answer;
    }
}
