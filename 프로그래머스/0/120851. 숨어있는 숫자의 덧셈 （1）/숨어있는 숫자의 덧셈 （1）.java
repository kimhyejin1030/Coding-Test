class Solution {
    public int solution(String my_string) {
        
        String str = my_string.replaceAll("[a-z]","");
        int answer = str.chars()
            .filter(Character::isDigit)
            .map(ch -> ch - '0')
            .sum();
        
        return answer;
    }
}