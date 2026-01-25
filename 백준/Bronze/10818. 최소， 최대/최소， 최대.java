//  최소, 최대

import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int N = Integer.parseInt(br.readLine());

		StringTokenizer st = new StringTokenizer(br.readLine());

		int min = 1000001;
		int max = -1000001;

		for (int i = 0; i < N; i++) {
			int current = Integer.parseInt(st.nextToken());
			if (current < min) {
				min = current;
			}
			if (current > max) {
				max = current;
			}
		}
		System.out.println(min + " " + max);
	}
}