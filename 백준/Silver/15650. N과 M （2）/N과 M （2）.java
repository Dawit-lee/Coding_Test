import java.util.*;
import java.io.*;

public class Main {
    static int N, M;
    static int[] selected;
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        selected = new int[M];

        dfs(0, 1); // 시작값 1부터
        System.out.print(sb);
    }

    static void dfs(int depth, int start) { // start: 이번에 고를 수 있는 최솟값
        if (depth == M) {
            for (int i = 0; i < M; i++) {
                sb.append(selected[i]);
                if (i < M - 1) sb.append(" ");
            }
            sb.append("\n");
            return;
        }

        for (int i = start; i <= N; i++) { // start부터 탐색 → 오름차순 + 중복 방지
            selected[depth] = i;
            dfs(depth + 1, i + 1); // 다음은 반드시 i보다 큰 수
        }
    }
}