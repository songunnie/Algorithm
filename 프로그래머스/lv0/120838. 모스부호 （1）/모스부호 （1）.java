class Solution {
    public String solution(String letter) {
        String answer = "";
        String morse = ".- -... -.-. -.. . ..-. --. .... .. .--- -.- .-.. -- -. --- .--. --.- .-. ... - ..- ...- .-- -..- -.-- --..";
        String[] msArr = morse.split(" ");
        String[] ltr = letter.split(" ");
        
        for(int i=0; i<=ltr.length-1; i++) {
            for(int j=0; j<=msArr.length-1; j++) {
                if(ltr[i].equals(msArr[j])) {
                    answer += (char)(j + 97);
                }
            }
        }
        return answer;
    }
}

//Map class의 HashMap 을 활용한 
import java.util.Map;
import java.util.HashMap;

class Solution {
    public String solution(String letter) {
        String answer = "";
        Map<String, String> morse = new HashMap<>(){
            {
                put(".-","a");
                put("-...","b");
                put("-.-.","c");
                put("-..","d");
                put(".","e");
                put("..-.","f");
                put("--.","g");
                put("....","h");
                put("..","i");
                put(".---","j");
                put("-.-","k");
                put(".-..","l");
                put("--","m");
                put("-.","n");
                put("---","o");
                put(".--.","p");
                put("--.-","q");
                put(".-.","r");
                put("...","s");
                put("-","t");
                put("..-","u");
                put("...-","v");
                put(".--","w");
                put("-..-","x");
                put("-.--","y");
                put("--..","z");
            }
        };
        String[] letters = letter.split(" ");
        for(String str : letters){
            answer += morse.get(str);
        }
        return answer;
    }
}
