class Solution {
    public double solution(int[] numbers) {
        double avg = 0;
        int sum = 0;
        for(int num : numbers) {
            sum += num;
        }
        avg = sum/(double)numbers.length;
        return avg;
    }
}

// 평균을 저장할 변수 avg, 총합을 저장할 변수 sum 하나씩 type을 명확히하여 초기화해준다.
// 8번째 줄에서 (double) 타입으로 안바꿔줘서 계속 안되는 거였다! ㅠㅠ sum 혹은 numbers.length 둘 중 하나는 (double)로 변환시켜줘야 한다!
