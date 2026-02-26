import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while (true) {
            String str = br.readLine();
            
            if (str.equals("0")) break;

            int len = str.length();
            int halfLen = len / 2;

            char[] firstHalf = new char[halfLen];
            char[] secondHalf_R = new char[halfLen];

            // 1. 첫 번째 반 저장 (0부터 halfLen - 1까지)
            for (int i = 0; i < halfLen; i++) {
                firstHalf[i] = str.charAt(i);
            }
            
            for (int i = 0; i < halfLen; i++) {
                secondHalf_R[i] = str.charAt(len - 1 - i);
            }
            
            if (Arrays.equals(firstHalf, secondHalf_R)) {
                System.out.println("yes");
            } else {
                System.out.println("no");
            }
        }
    }
}

