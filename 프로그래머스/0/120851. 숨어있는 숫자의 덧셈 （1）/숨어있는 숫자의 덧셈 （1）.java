class Solution {
    public int solution(String my_string) {
        
        String str = my_string.replaceAll("[^0-9]","");
        
        int answer = 0;
        for(char ch : str.toCharArray()) {
            answer += ch - '0';
        }
        
        return answer;
    }
}