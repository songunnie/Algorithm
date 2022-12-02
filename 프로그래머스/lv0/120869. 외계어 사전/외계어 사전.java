// class Solution {
//     public int solution(String[] spell, String[] dic) {
//         int answer = 0;
//         String[] str = new String[10];
//         for(int i=0; i<=spell.length-1; i++) {
//             for(int j=0; j<=dic.length-1; j++) {
//                 if(!dic[j].contains(spell[i])) {
//                     answer=2;
//                 } else  {
//                     answer=1;
//                 }
//             }
//         }
//         // System.out.println(dic[0]);
//         // System.out.println(spell[0]);
//         // System.out.println(dic[0].contains(spell[0]));
//         return answer;
//     }
// }
class Solution {
    public int solution(String[] spell, String[] dic) {
        int answer = 0;
        boolean contain = false;
        
        for(int i=0; i<=dic.length-1; i++) {
            contain = false;
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
            } else {
                answer = 2;
            }
        }
        return answer;
    }
}