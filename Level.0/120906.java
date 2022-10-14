class Solution {
    public int solution(int n) {
        int sum = 0;
        while(n>10) {
            sum += n%10;
            n /= 10;
            
            if(n<10) {
                sum += n%10;
            }
        }
        return sum;
    }
}

// 더 좋은 Solution!
class Solution {
    public int solution(int n) {
        int sum = 0;
        while(n>0) {
            sum += n%10;
            n /= 10;
        }
        return sum;
    }
}

// 조금 더 java식 풀이랄까?
class Solution {
    public int solution(int n) {
        int answer = 0;
        String[] s = Integer.toString(n).split("");
        for(int i=0; i<s.length; i++){
            answer += Integer.parseInt(s[i]);
        }

        return answer;
    }
}
