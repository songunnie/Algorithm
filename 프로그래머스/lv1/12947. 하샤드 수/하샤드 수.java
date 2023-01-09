class Solution {
    public boolean solution(int x) {
        boolean answer = true;
        String[] arr = String.valueOf(x).split("");
        int sum = 0;
        for(String a : arr) {
            sum += Integer.parseInt(a);
        }
        
        answer = (x % sum == 0) ? true : false;
        return answer;
    }
}