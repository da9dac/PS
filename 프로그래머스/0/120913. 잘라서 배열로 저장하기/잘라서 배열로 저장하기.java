class Solution {
    public String[] solution(String my_str, int n) {
        int len = my_str.length();
        String[] answer = new String[(len + n - 1)/ n];
        int idx = 0;
        
        for (int i = 0; i < len; i += n) {
            int last = i + n;
            if (last > len) last = len;
            answer[idx++] = my_str.substring(i, last);
        }
        
        return answer;
    }
}