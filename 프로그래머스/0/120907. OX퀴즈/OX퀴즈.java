import java.util.Arrays;

public class Solution {
    public static String[] solution(String[] quiz) {
        String[] answer = new String[quiz.length];

        for (int i = 0; i < quiz.length; i++) {
            String[] parts = quiz[i].split(" "); // ["3", "+", "4", "=", "7"]
            int x = Integer.parseInt(parts[0]);
            int y = Integer.parseInt(parts[2]);
            int z = Integer.parseInt(parts[4]);
            
            int result = 0;
            if (parts[1].equals("+")) {
                result = x + y;
            } else if (parts[1].equals("-")) {
                result = x - y;
            }

            answer[i] = (result == z) ? "O" : "X";
        }

        return answer;
    }

    public static void main(String[] args) {
        String[] quiz = {"3 + 4 = 7", "5 - 2 = 5", "10 - 7 = 3"};
        System.out.println(Arrays.toString(solution(quiz))); 
    }
}
