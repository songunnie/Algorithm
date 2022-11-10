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