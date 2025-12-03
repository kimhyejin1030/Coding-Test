public class Solution {
    public int solution(String s) {
        int answer = 0;
        char x = s.charAt(0); 
        int count = 0;     

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            if (count == 0) {
                x = c;
                answer++;   
            }

            if (c == x) count++;
            else count--;
        }

        return answer;
    }
}
