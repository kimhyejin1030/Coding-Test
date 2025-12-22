import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int ans = 0;

        for (int i = 0; i < n; i++) {
            String s = br.readLine();
            char[] stack = new char[s.length()];
            int top = 0;

            for (int j = 0; j < s.length(); j++) {
                char c = s.charAt(j);

                if (top > 0 && stack[top - 1] == c) {
                    top--;
                } else {
                    stack[top] = c;
                    top++;
                }
            }

            if (top == 0) ans++;
        }

        System.out.println(ans);
    }
}