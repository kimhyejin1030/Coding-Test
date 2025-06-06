class Solution {
    public double solution(int[] numbers) {
        int sum = 0;
        for (int num : numbers) {
            sum += num;
        }
        int count = numbers.length;
        double average = (double) sum / count;
        return average;
    }
}