class Solution {
    public int solution(int num, int k) {
        int idx = 0;
        String str = Integer.toString(num); //"29183"
        int[] arr = new int[str.length()];
        for(int i=0; i<=str.length()-1; i++) {
            arr[i] = str.charAt(i) - 48;
        }
        
        for(int i=0; i<=str.length()-1; i++) {
            if(arr[i] != k) {
                idx++;
            } else if (arr[i] == k) {
                return i+1;
            }
        }
        return -1;
    }
}