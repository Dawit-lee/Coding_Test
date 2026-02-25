import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int N = Integer.parseInt(br.readLine());
		int T = Integer.parseInt(br.readLine());

		Queue<Integer> apartment = new ArrayDeque<Integer>(); // LinkedList 보다 효과적 (노드 생성해야함)

		StringTokenizer st = new StringTokenizer(br.readLine()); // "2,2,4,3,1,1,3,4" 문자열
		for (int i = 0; i < N * 2; i++) {
			apartment.add(Integer.parseInt(st.nextToken())); // [2,2,4,3,1,1,3,4]
		}

		st = new StringTokenizer(br.readLine()); //st2
		StringBuilder sb = new StringBuilder();

		for (int j = 0; j < T; j++) {
			int GS = Integer.parseInt(st.nextToken());


			int moves = (GS - 1) % (2 * N);
			for (int i = 0; i < moves; i++) {
				apartment.add(apartment.poll());
			}

			// 2. 현재 맨 아래(큐의 front)에 있는 사람이 패배자
			sb.append(apartment.peek()).append(" "); //peek 맨 처음만 읽는 도구
		}

		// 결과 출력
		System.out.println(sb.toString().trim()); //trim 공백을 잘라줌
	}
}

