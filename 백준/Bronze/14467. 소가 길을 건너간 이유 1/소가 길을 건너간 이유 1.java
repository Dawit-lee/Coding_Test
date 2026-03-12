import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int cross = 0;

        int N = Integer.parseInt(br.readLine());

        int[] cow = new int[11];

        for (int i = 1; i <= 10; i++) {
            cow[i] = -1;
        }

        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int cow_num = Integer.parseInt(st.nextToken());
            int location = Integer.parseInt(st.nextToken());

            if (cow[cow_num] == -1) {
                cow[cow_num] = location;
            } else if (cow[cow_num] != location) {
                cross++;
                cow[cow_num] = location;
            }
        }
        System.out.println(cross);
    }
}
