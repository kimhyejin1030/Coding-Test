class Solution {
    public int solution(int n) {
        int pices = 6;
        
        while(pices % n != 0){
            pices += 6;
        }
        
        return pices / 6;
    }
}