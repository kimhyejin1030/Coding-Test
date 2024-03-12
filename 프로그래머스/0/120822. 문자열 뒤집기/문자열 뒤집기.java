class Solution {
    public String solution(String my_string) {
        String answer = my_string;
        
        StringBuffer sb = new StringBuffer(answer);
        String reverse = sb.reverse().toString();
        
        return reverse;
    }
}