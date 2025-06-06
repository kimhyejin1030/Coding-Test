public class Solution {
    public int solution(int price) {
        int rate = 100;

        if (price >= 500000) {
            rate = 80;
        } else if (price >= 300000) {
            rate = 90;
        } else if (price >= 100000) {
            rate = 95;
        }

        return price * rate / 100;
    }
}
