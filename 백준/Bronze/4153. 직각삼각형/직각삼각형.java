
//  직각삼각형

import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

// 수정: 무한루프 대신 '읽을 숫자가 있는지' 먼저 확인합니다.
		while (sc.hasNextInt()) {
			int a = sc.nextInt();
			// 다음 숫자들이 없을 경우를 대비해 안전하게 체크합니다.
			if (!sc.hasNextInt()) break;
			int b = sc.nextInt();
			if (!sc.hasNextInt()) break;
			int c = sc.nextInt();

			// 종료 조건 (0 0 0 입력 시)
			if (a == 0 && b == 0 && c == 0)
				break;

			if (a > b && a > c) {
				if ((a * a) == (b * b) + (c * c)) {
					System.out.println("right");
				} else {
					System.out.println("wrong");
				}
			} else if (b > a && b > c) {
				if ((b * b) == (a * a) + (c * c)) {
					System.out.println("right");
				} else {
					System.out.println("wrong");
				}
			} else if (c > a && c > b) {
				if ((c * c) == (a * a) + (b * b)) {
					System.out.println("right");
				} else {
					System.out.println("wrong");
				}
			} else {
					System.out.println("wrong");
			}
		}
	}
}