class Solution {
    public int solution(int[] sides) {
        int max = sides[0];
        int sum = 0;
        
        for(int i=0; i < 3; i++){
            if(sides[i] > max) {
                max = sides[i];
            }
            sum += sides[i];
        }
        
        int rest = sum - max;
        
        return (rest > max) ? 1: 2;
    }
}