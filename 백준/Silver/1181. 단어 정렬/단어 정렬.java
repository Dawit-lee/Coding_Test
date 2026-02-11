// 코딩 따라 하기

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashSet;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(br.readLine()); // parseInt("11", 2) 2진수로 읽음

		HashSet<String> set = new HashSet<>();

		for (int i = 0; i < n; i++) {
			set.add(br.readLine());
		}

		// String[] words = new String[n]; if문, for문 (equal) 받아야되서 헷갈림
		String[] words = set.toArray(new String[0]);

		StringBuilder sb = new StringBuilder();


		Arrays.sort(words, new Comparator<String>() {
			@Override
			public int compare(String o1, String o2) {
				if (o1.length() == o2.length()) {
					return o1.compareTo(o2);
				}
				else {
					return o1.length() - o2.length();
				}
			}
		});

		for (String word : words) {
			sb.append(word).append('\n');
		}
		System.out.println(sb);
	}
}
