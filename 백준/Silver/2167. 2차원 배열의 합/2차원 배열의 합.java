import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
            // 1. BufferedReader로 입력 받기
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            StringTokenizer st = new StringTokenizer(br.readLine());

            int N = Integer.parseInt(st.nextToken());
            int M = Integer.parseInt(st.nextToken());

            int[][] S = new int[N + 1][M + 1];

            for (int i = 1; i <= N ; i++) {
                st = new StringTokenizer(br.readLine());
                for (int j = 1; j <= M; j++) {
                    int current = Integer.parseInt(st.nextToken());
                    S[i][j] = current + S[i - 1][j] + S[i][j - 1] - S[i - 1][j - 1];
                }
            }
            int K = Integer.parseInt(br.readLine());
            StringBuilder sb = new StringBuilder();

            for (int k = 0; k < K; k++) {
                st = new StringTokenizer(br.readLine());
                int i = Integer.parseInt(st.nextToken());
                int j = Integer.parseInt(st.nextToken());
                int x = Integer.parseInt(st.nextToken());
                int y = Integer.parseInt(st.nextToken());

                int result = S[x][y] - S[i - 1][y] - S[x][j - 1] + S[i - 1][j - 1];
                sb.append(result).append("\n");
        }
        System.out.print(sb.toString());
        }
    }

