import java.util.*;

class Solution {
    public int[] solution(String my_string) {
        String result = my_string.replaceAll("[a-z]","");
        
        int[] answer = new int[result.length()];
        for(int i=0; i < result.length(); i++) {
            answer[i] = Character.getNumericValue(result.charAt(i));
        }

        Arrays.sort(answer);
        return answer;
    }
}