// 원래 내 풀이
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

// 제곱근을 통한 풀이.
class Solution {
    public int solution(int left, int right) {
        int answer = 0;

        for (int i=left;i<=right;i++) {
            //제곱수인 경우 약수의 개수가 홀수, 제곱근이 아닌 경우 약수의 개수 짝수
            answer = (i % Math.sqrt(i) == 0) ? (answer -= i) : (answer += i);
        }

        return answer;
    }
}
