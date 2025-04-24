import java.util.HashMap;

class Solution {
    public String solution(String rsp) {
        HashMap<Character, Character> winMap = new HashMap<>();
        winMap.put('2','0');
        winMap.put('0','5');
        winMap.put('5','2');
        
        StringBuilder answer = new StringBuilder();
        
        for(int i = 0; i < rsp.length(); i++){
            char ch = rsp.charAt(i);
            answer.append(winMap.get(ch));
        }
        return answer.toString();
    }
}