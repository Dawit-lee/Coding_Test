import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());

		int[][] grid = new int[N][M];
		int[][] dist = new int[N][M];

		int start_n = 0;
		int start_m = 0;

		int count = 0;

		Queue<int[]> q =  new ArrayDeque<>();

		for (int i = 0; i < N; i++) {
			st = new StringTokenizer(br.readLine());
			for (int j = 0; j < M; j++) {
				grid[i][j] = Integer.parseInt(st.nextToken());
				if (grid[i][j] == 0) {
					continue;
				}
				if (grid[i][j] == 1) {
					dist[i][j] = -1;
				}
				if (grid[i][j] == 2) {
					start_n = i;
					start_m = j;
					q.add(new int[] {i, j});
				}
			}
		}

		int[] dx = {0, -1, 0, 1};
		int[] dy = {1, 0, -1, 0};

		while (!q.isEmpty()) {
			int[] cur = q.poll();
			int x = cur[0];
			int y = cur[1];

			for (int i = 0; i < 4; i++) {
				int nx = x + dx[i];
				int ny = y + dy[i];

				if (nx >= 0 && nx < N && ny >= 0 && ny < M) {
					if (dist[nx][ny] == -1) {
						q.add(new int[] {nx, ny});
						dist[nx][ny] = dist[x][y] + 1;
					}
				}
			}
		}
		StringBuilder sb = new StringBuilder(); // 스트링빌더는 왜?
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < M; j++) {
				sb.append(dist[i][j]);
				if (j < M - 1) sb.append(' ');
			}
			sb.append('\n');
		}
		System.out.print(sb);
	}
}
