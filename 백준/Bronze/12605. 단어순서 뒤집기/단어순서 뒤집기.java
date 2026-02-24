import javax.swing.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		// String str1 = br.readLine();
		// int number = Integer.parseInt(str1);

		int number = Integer.parseInt(br.readLine());
		StringBuilder result = new StringBuilder();

		for (int i = 0; i <= number-1; i++) {
			String[] words = br.readLine().split(" ");
			StringBuilder sb = new StringBuilder();

			for (int j = words.length - 1; j >= 0; j--) {
				sb.append(words[j]);
				if (j > 0) {
					sb.append(" ");
				}
			}
			result.append(String.format("Case #%d: %s%n", i + 1, sb.toString()));
		}
		System.out.print(result);
	}
}
