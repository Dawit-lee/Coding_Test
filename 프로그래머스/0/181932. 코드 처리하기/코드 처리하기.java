class Solution {
    public String solution(String code) {
        StringBuilder ret = new StringBuilder();
        int mode = 0;
        
        for (int idx = 0; idx < code.length(); idx++) {
            char c = code.charAt(idx);
            
            if (c == '1') {
                // 문자가 '1'이면 mode를 0은 1로, 1은 0으로 바꿈
                mode = 1 - mode;
            } else {
                // 문자가 '1'이 아닐 때
                if (mode == 0 && idx % 2 == 0) {
                    // mode가 0이고 인덱스가 짝수일 때 추가
                    ret.append(c);
                } else if (mode == 1 && idx % 2 != 0) {
                    // mode가 1이고 인덱스가 홀수 일 때 추가
                    ret.append(c);
                }
            }
        }
        
        if (ret.length() == 0) {
            return "EMPTY";
        }
        return ret.toString();
    }
}