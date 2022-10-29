class Solution {
    public int solution(String my_string) {
        int answer = 0;
        String str = my_string.replaceAll("[^0-9]","");
        int[] arr = new int[str.length()];
        for(int i=0; i<=str.length()-1; i++) {
            arr[i] = Integer.parseInt(str.substring(i,i+1));
            answer += arr[i];
        }
        return answer;
    }
}