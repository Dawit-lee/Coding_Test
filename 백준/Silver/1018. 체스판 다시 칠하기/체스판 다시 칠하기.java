import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        char[][] board = new char[N][M];
        for (int i = 0; i < N; i++)
            board[i] = br.readLine().toCharArray();

        int min = Integer.MAX_VALUE;

        for (int i = 0; i <= N - 8; i++) {
            for (int j = 0; j <= M - 8; j++) {
                int cntW = 0; // 왼쪽 위가 W인 체스판 기준 틀린 칸 수
                for (int r = i; r < i + 8; r++) {
                    for (int c = j; c < j + 8; c++) {
                        char expected = ((r + c) % 2 == 0) ? 'W' : 'B';
                        if (board[r][c] != expected) cntW++;
                    }
                }
                min = Math.min(min, Math.min(cntW, 64 - cntW));
            }
        }

        System.out.println(min);
    }
}