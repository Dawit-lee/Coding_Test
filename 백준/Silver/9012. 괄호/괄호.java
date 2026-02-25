import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        for (int i = 0; i < N; i++) {
            String VPS = br.readLine();
            int count = 0;
            boolean isPT = true;

            for (int j = 0; j < VPS.length(); j++) {
                char c = VPS.charAt(j);

                if (c == '(') {
                    count++;
                } else if (c == ')') {
                    count--;
                }

                if (count < 0) {
                    isPT = false;
                    break;
                }
            }
            if (isPT && count == 0) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}

