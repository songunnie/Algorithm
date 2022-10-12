class Solution {
    public String solution(String my_string) {
        StringBuffer sb = new StringBuffer(my_string);
        String reverse = sb.reverse().toString();
        return reverse;
    }
}

// 여기서 StringBuilder를 써도된다. 사용법은 StringBuffer와 동일하다.
/* StringBuffer는 멀티 스레드 환경에서 안전하다는 장점이 있고 StringBuilder는 StringBuffer보다 성능이 우수한 장점이 있다.
따라서 동기화를 고려할 필요가 없는 상황에서는 StringBuffer 보다는 StringBuilder를 사용하는 것이 유리하다.*/

class Solution {
    public String solution(String my_string) {
        StringBuilder sb = new StringBuilder(my_string);
        return sb.reverse().toString();
    }
}

// 처음푼건 0.12ms 까지 나왔는데, StringBuilder로 사용했을 땐 0.02ms까지 나왔다
