class Solution {
    public int solution(String message) {
        String[] arr = message.split("");
        
        return 2*arr.length;
    }
}

// 나.. 혹시 바보인걸까? 한번 더 생각해보자.
class Solution {
    public int solution(String message) {
      
        return message.length()*2;
    }
}

//0.15ms -> 0.03ms 까지 줄어든다!
