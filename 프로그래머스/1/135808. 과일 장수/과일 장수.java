import java.util.*;

class Solution {
    public int solution(int k, int m, int[] score) {
        Arrays.sort(score);
        int total = 0;
        int cnt = 0;
        int idx = score.length - 1;

        while (idx - (m - 1) >= 0) {
            int min = score[idx - (m - 1)];
            total += min * m;
            idx -= m;
        }

        return total;
    }
}
