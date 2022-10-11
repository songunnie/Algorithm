class Solution {
    public int solution(int num1, int num2) {
        double num = (double)num1 / num2;
        num = num * 1000;
        return (int)num;
    }
}

// return에서 바로 (int)로 형변환핻 되는지 몰랐다.
