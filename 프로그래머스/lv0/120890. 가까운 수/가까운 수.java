import java.util.*;
class Solution {
    public int solution(int[] array, int n) {
        Arrays.sort(array);
        int answer = Math.abs(array[0]-n);
        //int num = 0; 나는 int 를 0으로 초기화해서 테케 하나가 실패했던것.
        int num = array[0];
        for(int i=1; i<=array.length-1; i++) {
            if(answer > Math.abs(array[i]-n)) {
                answer = Math.abs(array[i]-n);
                num=array[i];
            }
        }
        return num;
    }
}
//테스트 케이스 [1, 3, 5, 7, 9] , 2 해서 시도해봤음.

// better solution
// 처음부터 answer, num 초기화를 최대의 정수로 초기화해주는게 비교하기 더 쉽다.
//그래서 내 코드는 0번 인덱스부터 비교하니까 i=1이어도 되지만, 여기는 인덱스를 0부터 비교해야하니까 int i=0이 된다.
import java.util.*;
class Solution {
    public int solution(int[] array, int n) {
        Arrays.sort(array);
        int answer = 100; //어차피 최대값의 최대는 99니까 100으로 설정
        int num = 0;
        for(int i=0; i<=array.length-1; i++) {
            if(answer > Math.abs(array[i]-n)) {
                answer = Math.abs(array[i]-n);
                num=array[i];
            }
        }
        return num;
    }
}
