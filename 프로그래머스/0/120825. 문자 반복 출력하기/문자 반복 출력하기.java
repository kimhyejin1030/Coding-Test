class Solution {
    public String solution(String my_string, int n) {
        StringBuilder sb = new StringBuilder();

        for (String ch : my_string.split("")) {
            sb.append(ch.repeat(n));
        }

        return sb.toString();
    }
}
