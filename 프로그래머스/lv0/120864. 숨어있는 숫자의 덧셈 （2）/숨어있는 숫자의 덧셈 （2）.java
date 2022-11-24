class Solution {
    public int solution(String my_string) {
        int answer = 0;
        String str = my_string.toLowerCase();
        
        String[] arr = str.split("[a-z]");
        
        for(int i=0; i<=arr.length-1; i++) {
            if(!arr[i].equals("")) {
                answer+=Integer.parseInt(arr[i]);
            }
        }
        return answer;
    }
}