// 코딩 따라 하기

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;

		public class Main {
			public static void main(String[] args) throws IOException {
				BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

				HashSet<Integer> set = new HashSet<>();

				for (int i = 0; i < 10; i++) {
					String line = br.readLine(); // 숫자를 문자열로 바꿈

					int num = Integer.parseInt(line); // 위 수행시, 무조건 필요

					int rest = (num % 42);

					set.add(rest);
					}
					System.out.println(set.size());
				}
			}
