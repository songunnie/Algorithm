class Solution {
    public int[] solution(int[] num_list) {
        int[] reverse = new int[num_list.length];
        for(int i=0; i<=num_list.length-1; i++) {
            reverse[i] = num_list[num_list.length-1-i];
        }
        return reverse;
    }
}

// 먼저, num_list.length 크기의 reverse 배열을 선언해준다.
/* 예를들어 5크기의 배열이라면, [0],[1],[2],[3],[4]가 된다. 따라서 for문을 돌려서 i=0부터, i<num_list.length-1; i++ 을 이용해
reverse[i] = num_list[num_list-1-i]라는 공식을 만든다. */
