class Solution {
    public int solution(int[] array) {
        int answer = 0;
        int[] arr = new int[1001];
        
        for(int i=0; i<=array.length-1; i++) {
            arr[array[i]]++;
        }
        
        int max = 0;
        int max_idx = 0;
        
        for(int i=0; i<=arr.length-1; i++) {
            if(arr[i]>max) {
                max = arr[i];
                max_idx = i;
            }
        }
        
        int cnt = 0;
        for(int i=0; i<=arr.length-1; i++) {
            if(arr[i] == max) cnt++;
        }
        
        if(cnt>1) {
            return -1;
        }
        
        answer = max_idx;
        return answer;
    }
}