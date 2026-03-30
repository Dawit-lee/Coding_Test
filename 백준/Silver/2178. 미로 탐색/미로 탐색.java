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

		String[] maze = new String[N];

		for (int i = 0; i < N; i++) {
			maze[i] = br.readLine();
		}

		boolean[][] visited = new boolean[N][M];

		Queue<int[]> queue = new LinkedList<>();

		queue.add(new int[]{0, 0, 1});
		visited[0][0] = true;

		int dx[] = {0, 1, 0, -1};
		int dy[] = {1, 0, -1, 0};

		while (!queue.isEmpty()) {
			int[] cur = queue.poll();
			int x = cur[0];
			int y = cur[1];
			int count = cur[2];

			if (x == N - 1 && y == M - 1) {
				System.out.println(count);
				return;
			}
				for (int d = 0; d < 4; d++) {
					int nx = x + dx[d];
					int ny = y + dy[d];
					if (nx < 0 || nx >= N || ny < 0 || ny >= M) {
						continue;
					}
					if (visited[nx][ny]) {
						continue;
					}
					if (maze[nx].charAt(ny) == '0') {
						continue;
					}
					if (!visited[nx][ny]) {
						visited[nx][ny] = true;
						queue.add(new int[]{nx, ny, count + 1});
					}
				}
			}
		}
	}
