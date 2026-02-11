// 코딩 따라 하기

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

		public class Main {
			public static void main(String[] args) throws IOException {
				BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

				// 입력받은 줄을 바로 StringTokenizer에 넣습니다.
				StringTokenizer st = new StringTokenizer(br.readLine(), " "); //    private String delimiters;

				// 남아있는 토큰(단어)의 개수를 바로 출력하면 끝!
				System.out.println(st.countTokens());
			}
		}