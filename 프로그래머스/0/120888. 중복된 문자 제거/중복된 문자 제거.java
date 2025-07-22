import java.util.*;

class Solution {
    public String solution(String my_string) {
        Set<String> set = new LinkedHashSet<>();
        for(char ch : my_string.toCharArray()){
            set.add(String.valueOf(ch));
        }
        
        StringBuilder sb = new StringBuilder();
        for (String s : set) {
            sb.append(s);
        }

        return sb.toString();
    }
}