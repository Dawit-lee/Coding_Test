import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();

        // 1. 곱한 결과를 문자열로 바꿉니다. (예: 17037300 -> "17037300")
        String str = String.valueOf(A * B * C);
        int[] counts = new int[10];

        // 2. 문자열의 길이만큼 for 문을 돌립니다.
        for (int i = 0; i < str.length(); i++) {
            // str.charAt(i)는 문자 '0'~'9'를 가져옵니다.
            // 여기서 '0'을 빼주면 실제 숫자 0~9가 됩니다. (아스키 코드 원리!)
            int digit = str.charAt(i) - '0';
            counts[digit]++;
        }

        // 3. 출력
        for (int i = 0; i < 10; i++) {
            System.out.println(counts[i]);
        }
    }
}