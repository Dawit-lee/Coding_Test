//  최댓값

import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int max = 0;
		int index = 0;

		for (int i = 1; i <= 9; i++) {
			int Input = scanner.nextInt();
		if (Input > max) {
			max = Input;
			index = i;
		}
	}
		System.out.println(max);
		System.out.println(index);
	}
}