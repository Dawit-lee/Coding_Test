import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int w_number = 0;
        int w_max = 0;

        for (int i = 1; i <= 5; i++) {

            int sum = 0;

            String line = br.readLine();
            StringTokenizer st = new StringTokenizer(line);

            for (int j = 1; j <= 4; j++) {
                sum += Integer.parseInt(st.nextToken());
            }
            if (sum > w_max) {
                w_number = i;
                w_max = sum;
            }
        }
        System.out.printf("%d %d", w_number, w_max);
    }
}
