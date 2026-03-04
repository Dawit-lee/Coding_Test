class Solution {
    public String solution(String phone_number) {
        String answer = "";
        int len = phone_number.length();
        
        // BufferReader = new BufferReader(new InputStream(System.in));
        
        for(int i = 0; i < len; i++) {
            // { if (i = 1,2,3,4)
            if (i < len - 4) {
                answer = answer + "*";
            } else {
            answer = answer + phone_number.charAt(i);
            }
    }
    return answer;
}
}