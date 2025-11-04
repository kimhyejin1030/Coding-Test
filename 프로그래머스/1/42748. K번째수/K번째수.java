import java.util.Arrays;
class Solution {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];
        int num = 0;
        for(int[] arr : commands) {
            int i = arr[0];
            int j = arr[1];
            int k = arr[2];
            
            int[] temp = Arrays.copyOfRange(array, i-1, j);
            Arrays.sort(temp);
            answer[num] = temp[k-1];
            num++;
        }
        return answer;
    }
}