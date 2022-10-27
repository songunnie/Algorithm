class Solution {
    public String solution(String my_string, int n) {
        String str = "";
        for(int i=0; i<=my_string.length()-1; i++) {
            for(int j=0; j<=n-1; j++) {
                str += my_string.charAt(i);
            }
        }
        return str;
    }
}

// .split과 .repeat를 활용한 풀이
class Solution {
    public String solution(String my_string, int n) {
        String answer = "";
        String[] str = my_string.split("");
        for(int i=0; i<my_string.length(); i++){
            answer += str[i].repeat(n);
        }
        return answer;
    }
}

//StringBuilder로 객체를 만들어 .toCharArray 와 .appent, .repeat를 활용한 풀이.
class Solution {
    public String solution(String my_string, int n) {
        StringBuilder sb = new StringBuilder();
        for(char c : my_string.toCharArray()){
            sb.append((c + "").repeat(n));
        }
        return sb.toString();
    }
}
