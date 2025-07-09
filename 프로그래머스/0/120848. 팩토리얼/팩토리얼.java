class Solution {
    public int solution(int n) {
        int factorial = 1;
        int i = 1;

        while (factorial * i <= n) {
            factorial *= i;
            i++;
        }

        return i - 1;
    }
}
