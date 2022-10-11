class Solution {
    public int solution(int num1, int num2) {
        int answer = (num1 == num2) ? 1 : -1;
        return answer;
    }
}

// 단순하게 참 or 거짓만 판별하는 문제는 '삼항연산자'로 가능해서 삼항연산자로 풀이.
// 조건이 4개 이하이면 if, 4개 이상이면 switch문을 사용하는 것이 유리.
// 하지만 switch문의 경우, jump table생성에 오버헤드 발생가능성이 있어서 메모리 사용량이 중요할 경우에는 if문을 사용하는 것이 낫다!
