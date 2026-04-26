class Solution {
    public String solution(String video_len, String pos, String op_start, String op_end, String[] commands) {
        String answer = "";
        
        int video = toSecond(video_len);
        int current = toSecond(pos);
        int opStart = toSecond(op_start);
        int opEnd = toSecond(op_end);
        
        current = skipOpening(current, opStart, opEnd);
        
        for (String cmd : commands) {
            if (cmd.equals("prev")) {
                current = current - 10;
                if (current < 0) {
                    current = 0;
                }
            } else if (cmd.equals("next")) {
                current = current + 10;
                if (current > video) {
                    current = video;
                }
            }
            
            current =skipOpening(current, opStart, opEnd);
            
            }
            answer = toTime(current);
            return answer;
        }
        
        String toTime(int time) {
            int minute = time / 60;
            int second = time % 60;
            
            return String.format("%02d:%02d", minute, second);
    }
    
    int toSecond(String time) {
        String[] arr = time.split(":");
        
        int minute = Integer.parseInt(arr[0]);
        int second = Integer.parseInt(arr[1]);
        
        return minute * 60 + second;
    }
    
    int skipOpening(int current, int opStart, int opEnd) {
        if (current >= opStart && current <= opEnd) {
            return opEnd;
        }
        return current;
    }
}