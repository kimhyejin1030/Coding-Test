class Solution {
    public int solution(int num, int k) {
        
        String s = String.valueOf(num); 
        char target = (char)(k + '0'); 
        
        for(int i=0; i < s.length(); i++) {
            if(s.charAt(i) == target) {
                return i+1;
            }
        }
        return -1;
    }
}