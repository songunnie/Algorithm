class Solution {
    public int[] solution(int[] numbers, int num1, int num2) {
        int[] answer = new int[num2-num1+1]; //num2-num1+1 크기의 배열선언,생성
        
        for(int i=num1, j=0; i<=num2; i++) {
            answer[j] = numbers[i];
            j++;
        }
        return answer;
    }
}

//j=0부터를 for문 안에 함께 생성,선언,대입해줘도 된다.
