class Solution {
    public int solution(String[] spell, String[] dic) {
        int answer = 2;
        
        for(int i=0; i<=dic.length-1; i++) {
            boolean contain = false;
            for(String s : spell) {
                if(dic[i].contains(s)) {
                    contain = true;
                }
                else {
                    contain = false;
                    break;
                }
            }
            if(contain) {
                answer = 1;
                break;
            }
        }
        return answer;
    }
}
