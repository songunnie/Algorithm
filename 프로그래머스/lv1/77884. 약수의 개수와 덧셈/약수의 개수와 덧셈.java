class Solution {
    public int solution(int left, int right) {
        int answer = 0;
    
        for(int n=left; n<=right; n++) {
            int cnt = 0;
            for(int i=1; i*i<=n; i++) {
                if(i*i == n) {
                    cnt++;
                } else if(n%i == 0) {
                    cnt +=2;
                } 
            }
            answer = (cnt % 2 == 0) ? (answer += n) : (answer -= n);
        }
        
        return answer;
    }
}

// 제곱수를 통해 약수 개수 구하기~
class Solution {
    public int solution(int left, int right) {
        int answer = 0;

        for (int i=left;i<=right;i++) {
            //제곱수인 경우 약수의 개수가 홀수
            if (i % Math.sqrt(i) == 0) {
                answer -= i;
            }
            //제곱수가 아닌 경우 약수의 개수가 짝수
            else {
                answer += i;
            }
        }

        return answer;
    }
}
