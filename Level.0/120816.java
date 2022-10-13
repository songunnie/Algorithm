class Solution {
    public int solution(int slice, int n) {
        int pizza = (n%slice == 0) ? n/slice : n/slice + 1;

        return pizza;
    }
}
