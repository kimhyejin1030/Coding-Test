class Solution {
    public int solution(int order) {
        String str = String.valueOf(order);
        
        int count = 0;
        for(int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if(ch == '3' || ch == '6' || ch == '9') {
                count++;
            }
        }
        return count;
    }
}