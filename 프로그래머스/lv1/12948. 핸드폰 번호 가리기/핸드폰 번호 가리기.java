class Solution {
    public String solution(String phone_number) {
        String answer = "";
        char[] arr = phone_number.toCharArray();
        
        System.out.println(arr[0]);
        for(int i=0; i<=phone_number.length()-5; i++) {
            arr[i] = '*';
        }
        
        answer = String.valueOf(arr);
        return answer;
    }
}