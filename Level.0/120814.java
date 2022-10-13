class Solution {
    public int solution(int n) {
        int pizza = 0;
        if(n % 7 == 0) {
            pizza = n/7;
        } else {
            pizza = n/7 + 1;
        }
        return pizza;
    }
}

// 한번 더 생각해보면,삼항 연산자가 가능하다.
class Solution {
    public int solution(int n) {
        int pizza = (n%7 == 0) ? n/7 : n/7 + 1;
      
        return pizza;
    }
}

