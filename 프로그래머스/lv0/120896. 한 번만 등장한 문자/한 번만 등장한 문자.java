import java.util.ArrayList;
import java.util.Collections;
class Solution {
    public String solution(String s) {
        StringBuffer sb = new StringBuffer();
        String[] trans = s.split("");
        ArrayList<String> arr = new ArrayList<>();
        for (int i=0; i<trans.length; i++) {
            if(!arr.contains(trans[i])) {
                arr.add(trans[i]);
            }
        }
        Collections.sort(arr);
        for(int i=0; i<arr.size(); i++) {
            String tmp = arr.get(i);
            if(s.indexOf(tmp) == s.lastIndexOf(tmp)) {
                sb.append(tmp);
            }
        }
        return sb.toString();
    }
}