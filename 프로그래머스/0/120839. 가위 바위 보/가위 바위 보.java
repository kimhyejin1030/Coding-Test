class Solution {
    public String solution(String rsp) {
        StringBuilder result = new StringBuilder();
        
        for(int i = 0; i < rsp.length(); i++) {
            char ch = rsp.charAt(i);
            
            if (ch == '2') {
                result.append('0');
            } else if (ch == '0') {
                result.append('5');
            } else if (ch == '5') {
                result.append('2');
            }
        }
        
        
        return result.toString();
    }
}