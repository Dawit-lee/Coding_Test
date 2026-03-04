class Solution {
    public int solution(int num) {
        long n = (long) num;
        int answer = 0;

        if (num == 1) return 0;
        
        // if (int num < 1 || int num > 8000000) return 0;
            
        while (n != 1) {
            if (n % 2 == 0) {
                n /= 2;
            } else {
                n = (n * 3) + 1;
            }
            
            answer++;
                
            if (answer >= 500) {
                return -1;
            }
        }
        return answer;
        }
    }