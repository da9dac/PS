class Solution {
    public String[] solution(String[] picture, int k) {
        int n = picture.length;
        int m = picture[0].length() * k;
        int line = 0;
        
        String[] answer = new String[n * k];
        char[][] chars = new char[n][m];
        
        for (int i = 0; i < n; i++) {
            int idx = 0;
            
            for (char p : picture[i].toCharArray()) {
                for (int j = 0; j < k; j++) {
                    chars[i][idx++] = p;
                }
            }
            
            String str = new String(chars[i]);
            
            for (int j = 0; j < k; j++) {
                answer[line++] = str;
            }
        }
        
        return answer;
    }
}