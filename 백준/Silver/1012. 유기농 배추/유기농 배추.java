import java.util.*;
import java.io.*;

public class Main {
    static int[][] g;
    static int N, M;
    static int[] dx = {0,0,1,-1}, dy = {1,-1,0,0};

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine().trim());

        for (int t = 0; t < T; t++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            M = Integer.parseInt(st.nextToken());
            N = Integer.parseInt(st.nextToken());
            int K = Integer.parseInt(st.nextToken());
            
            g = new int[N][M];
            
            for (int k = 0; k < K; k++) {
                st = new StringTokenizer(br.readLine());
                int x = Integer.parseInt(st.nextToken());
                int y = Integer.parseInt(st.nextToken());
                g[y][x] = 1;
            }

            int count = 0;
            for (int i = 0; i < N; i++) {
                for (int j = 0; j < M; j++) {
                    if (g[i][j] == 1) {
                        dfs(i, j);
                        count++;
                    }
                }
            }
            System.out.println(count);
        }
    }

    static void dfs(int x, int y) {
        g[x][y] = 0;
        for (int i = 0; i < 4; i++) {
            int nx = x+dx[i], ny = y+dy[i];
            if (nx>=0 && nx<N && ny>=0 && ny<M && g[nx][ny]==1) dfs(nx, ny);
        }
    }
}