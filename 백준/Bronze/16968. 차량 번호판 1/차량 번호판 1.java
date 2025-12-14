import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine().trim();

        long ans = 1;

        for (int i = 0; i < s.length(); i++) {
            char cur = s.charAt(i);

            if (i == 0) {
                ans *= (cur == 'c') ? 26 : 10;
            } else {
                char prev = s.charAt(i - 1);
                if (cur == 'c') {
                    ans *= (prev == 'c') ? 25 : 26;
                } else { // cur == 'd'
                    ans *= (prev == 'd') ? 9 : 10;
                }
            }
        }

        System.out.println(ans);
    }
}