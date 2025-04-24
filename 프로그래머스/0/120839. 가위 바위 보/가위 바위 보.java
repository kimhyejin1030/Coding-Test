class Solution {
    public String solution(String rsp) {
        String answer = "";
        
        for(int i=0; i < rsp.length(); i++){
            char ch = rsp.charAt(i);
            
            if (ch == '2'){
                answer = answer + '0';
            } else if (ch == '0') {
                answer = answer + '5';
            } else if (ch == '5') {
                answer = answer + '2';
            }
        }
        return answer;
    }
}