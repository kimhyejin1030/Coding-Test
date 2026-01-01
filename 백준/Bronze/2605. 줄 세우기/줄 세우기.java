import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        List<Integer> line = new ArrayList<>(); 

        for (int i = 1; i <= n; i++) {
            int move = sc.nextInt();

            int position = line.size() - move;

            line.add(position, i);
        }

        for (int student : line) {
            System.out.print(student + " ");
        }
    }
}
