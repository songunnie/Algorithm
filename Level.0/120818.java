class Solution {
    public int solution(int price) {
        if(100000<=price && price<300000) {
            return (int)(price*0.95);
        } else if(300000<=price && price<500000) {
            return (int)(price*0.9);
        } else if(500000<=price) {
            return (int)(price*0.8);
        } else {
            return price;
        }
    }
}

// 삼항연산자로도 풀었음

class Solution {
    public int solution(int price) {
        return 100000<=price && price<300000 ? (int)(price*0.95) : 300000<=price && price<500000 ? (int)(price*0.9) : 500000<=price ? (int)(price*0.8) : price;
    }
}
