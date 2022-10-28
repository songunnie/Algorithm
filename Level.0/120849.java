//replaceAll("[]","")
class Solution {
    public String solution(String my_string) {
        String answer = my_string.replaceAll("[aeiou]","");
        
        return answer;
    }
}

/*
replaceAll("[abc]","") 라면, abc가 아니라 a 혹은 b 혹은 c 를 만날 때마다 ""로 치환시켜준다.
*/
