class Solution {
    public int solution(int n) {
        int sum = 0;
        for(int i=1; i<=n; i++) {
            if(i % 2 == 0) {
                sum += i;
            }
        }
        return sum;
    }
}

// better solution
class Solution {
    public int solution(int n) {
        int answer = 0;

        for(int i=2; i<=n; i+=2){
            answer+=i;
        }

        return answer;
    }
}
