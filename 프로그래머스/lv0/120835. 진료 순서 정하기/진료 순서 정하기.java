import java.util.*;
class Solution {
    public int[] solution(int[] emergency) {
        int[] asc = emergency.clone();
        int[] answer = new int[emergency.length];
        
        Arrays.sort(asc);

        for(int i=0; i<=emergency.length-1; i++) {
            for(int j=0; j<=emergency.length-1; j++) {
                if(asc[i]==emergency[j]) {
                    answer[j]=emergency.length-i;
                }
            }
        }
        return answer;
    }
}

//.clone() 사용
class Main {
  public static void main(String[] args) {
    int a[] = {1, 8, 3}; 
    int b[] = a.clone();     

    b[0] = 10; 

    // 결과 확인
    System.out.print("a 배열 : "); 
    for (int v:a) 
        System.out.print(v + " "); 

    System.out.print("\nb 배열 : "); 
    for (int v:b) 
        System.out.print(v + " "); 
  }
}
