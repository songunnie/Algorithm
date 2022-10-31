//처음 생각했던 방법 = 훨씬 빠르다..:>
class Solution {
    public String solution(String rsp) {
        char[] c = rsp.toCharArray();
        StringBuilder answer = new StringBuilder();

        for(int i=0; i < c.length; i++) {
            switch(c[i]) {
                case '0' :
                    answer.append("5");
                    break;
                case '2' :
                    answer.append("0");
                    break;
                case '5' :
                    answer.append("2");
                    break;
            }
        }
        return answer.toString();

    }
}

//.charAt() 이용
class Solution {
    public String solution(String rsp) {
        String answer = "";
        
        for(int i=0; i<=rsp.length()-1; i++) {
            if(rsp.charAt(i) == '2') {
                answer+="0";
            } else if(rsp.charAt(i) == '0') {
                answer+="5";
            } else if(rsp.charAt(i) == '5') {
                answer+="2";
            }
        }
        
        return answer;
    }
}

//.equals() 이용
class Solution {
    public String solution(String rsp) {
        String answer = "";
        String[] arr = rsp.split("");
        for(int i=0;i < arr.length; i++) {
            if(arr[i].equals("2")) answer += "0";
            else if(arr[i].equals("0")) answer += "5";
            else answer += "2";
        }

        return answer;
    }
}

