class Solution {
    public int solution(int[] box, int n) {
        int answer = 0;
        
        int width = box[0];
        int length = box[1];
        int height = box[2];
        
        answer = (width / n) * (length / n) * (height / n);
        return answer;
    }
}