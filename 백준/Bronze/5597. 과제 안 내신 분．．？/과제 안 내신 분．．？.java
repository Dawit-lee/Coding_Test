import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        boolean[] array = new boolean[31];

        for (int i = 1; i <= 28; i++) {
            int n = Integer.parseInt(br.readLine());
            array[n] = true;
        }
        for (int i = 1; i <= 30; i++) {
            if(!array[i]) {
                System.out.println(i);
            }
        }
    }
}
