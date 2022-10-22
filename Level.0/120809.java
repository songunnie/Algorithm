class Solution {
    public int[] solution(int[] numbers) {
        int[] answer = new int[numbers.length];
        for(int i=0; i<=answer.length-1; i++) {
            answer[i]=numbers[i]*2;
        }
        return answer;
    }
}

//Better Solution
class Solution {
    public int[] solution(int[] numbers) {
        for(int i=0; i<=numbers.length-1; i++) {
            numbers[i]=numbers[i]*2;
        }
        return numbers;
    }
}
