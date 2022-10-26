class Solution {
    public int[] solution(int n, int[] numlist) {
        int idx = 0;
        for(int num : numlist) {
            if(num%n == 0) {
                idx++;
            }
        }
        
        int cnt = 0;
        int[] answer = new int[idx];
        for(int i=0; i<=numlist.length-1; i++) {
            if(numlist[i]%n == 0) {
                answer[cnt] = numlist[i];
                cnt++;
            }
        }
        return answer;
    }
}

//더 좋은 풀이 꼭 있을거니 풀이해둘 것
