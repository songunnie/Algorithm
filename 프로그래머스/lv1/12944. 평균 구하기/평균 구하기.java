class Solution {
    public double solution(int[] arr) {
        double answer = 0;
        int sum = 0;
        int num = arr.length;

        for(int a : arr) {
            sum += a;
        }
        
        return (double)sum/num;
    }
}