class Solution {
    public int solution(int i, int j, int k) {
        int answer = 0;
        String str = "";
        for(int n=i; n<=j; n++) {
            str += n;
        }
        
        for(int n=0; n<=str.length()-1; n++) {
            if((str.charAt(n) - '0') == k) {
                answer++;
            }
        }
            
        return answer;
    }
}

//다른 풀이
class Solution {
    public int solution(int i, int j, int k) {
        int answer = 0;

        for (int num = i; num <= j; num++){
            int tmp = num;
            while (tmp != 0){
                if (tmp % 10 == k)
                    answer++;
                tmp /= 10;
            }
        }
        return answer;
    }
}
