class Solution {
    public int solution(int order) {
        int answer = 0;
        String str = Integer.toString(order);
        
        for(int i=0; i<=str.length()-1; i++) {
            if(str.charAt(i)%3 == 0 && str.charAt(i) != '0') {
                answer++;
            }
        }
        return answer;
    }
}

// 내가 생각 못했던 부분은, 3으로 나눴을 때 0이 나오면 되지만 애초에 charAt으로 뽑은 값이 0이면 안된다는 것
