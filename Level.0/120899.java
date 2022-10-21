class Solution {
    public int[] solution(int[] array) {
        int[] answer = new int[2];
        int max = array[0];
        int index = 0;
        for(int i=0; i<=array.length-1; i++) {
            if(array[i] > max) {
                max = array[i];
                index = i;
            }
            answer[0]=max;
            answer[1]=index;
        }
        return answer;
    }
}

//Better Solution
class Solution {
    public int[] solution(int[] array) {
        int[] answer = new int[2];

        for(int i=0; i<=array.length-1; i++) {
            if(array[i] > answer[0]) {
                answer[0] = array[i];
                answer[1] = i;
            }
        }
        return answer;
    }
}
