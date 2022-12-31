import java.util.*;

class Solution {
    public int solution(int n) {
        int answer = 0;
        int sqrt = (int)Math.sqrt(n);
        ArrayList<Integer> arr = new ArrayList(); // 약수를 저장할 ArrayList
        
        for(int i=1; i<= sqrt; i++) {
            if(n % i == 0) { // 약수 중 작은 수 저장
                arr.add(i); { //add()로 ArrayList에 저장
                    if(n / i != i) { // 약수 중 큰 수 저장
                        arr.add(n/i);
                    }
                }
            }
        }
        
        for(int a : arr) {
            answer += a;
        }
        
        return answer;
    }
}