import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());

		char[][] square = new char[N][M];

		int x_1 = 0;
		int y_1 = 0;

		for (int i = 0; i < N; i++) {
			String row = br.readLine();
			for (int j = 0; j < M; j++) {
				square[i][j] = row.charAt(j);
				if (square[i][j] == 'I') {
					x_1 = i;
					y_1 = j;
				}
			}
		}

		int people = 0;

		boolean[][] visited = new boolean[N][M];
		Queue<int[]> queue = new LinkedList<>();

		visited[x_1][y_1] = true;
		queue.add(new int[] {x_1, y_1});

		int[] dx = new int[] {0, 1, 0, -1};
		int[] dy = new int[] {1, 0, -1, 0};

		while (!queue.isEmpty()) {
			int[] cur = queue.poll();
			int x = cur[0];
			int y = cur[1];

			for (int i = 0; i < 4; i++) {
				int nx = x + dx[i];
				int ny = y + dy[i];

			if (nx < 0 || nx >= N || ny < 0 || ny >= M) {
				continue;
			}
			if (visited[nx][ny]) {
				continue;
			}
			if (square[nx][ny] == 'X') {
				continue;
			}

			visited[nx][ny] = true;
			if (square[nx][ny] == 'P') {
				people++;
			}
			queue.add(new int[] {nx, ny});
			}
		}
		System.out.println(people == 0 ? "TT" : people);
	}
}
