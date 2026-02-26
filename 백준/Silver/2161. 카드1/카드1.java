import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
            // 1. BufferedReader로 입력 받기
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

            // 입력값이 하나뿐이라 StringTokenizer 없이 readLine()만 써도 되지만,
            // 여러 값이 들어올 때를 위해 습관적으로 사용하는 것이 좋습니다.
            StringTokenizer st = new StringTokenizer(br.readLine());
            int N = Integer.parseInt(st.nextToken());

            Queue<Integer> queue = new LinkedList<>();
            StringBuilder sb = new StringBuilder();

            // 큐 초기화
            for (int i = 1; i <= N; i++) {
                queue.offer(i);
            }

            // 2. 문제 로직 수행
            while (queue.size() > 1) {
                // 맨 위 카드 버리기
                sb.append(queue.poll()).append(" ");

                // 그다음 카드 맨 뒤로 이동
                queue.offer(queue.poll());
            }

            // 마지막 남은 카드 추가
            sb.append(queue.poll());

            // 3. 한 번에 출력
            System.out.println(sb.toString());
        }
    }

