class Solution {
    public String solution(String my_string) {
        boolean[] isUsed = new boolean[52];
        boolean isBlank = false;
        StringBuilder sb = new StringBuilder();
        
        for (int i = 0; i < my_string.length(); i++) {
            char c = my_string.charAt(i);
            if (c == ' ') {
                if (isBlank) continue;
                isBlank = true;
                sb.append(c);
            }
            else if (Character.isUpperCase(c)) {
                if (isUsed[c - 'A' + 26]) continue;
                isUsed[c - 'A' + 26] = true;
                sb.append(c);
            } else {
                if (isUsed[c - 'a']) continue;
                isUsed[c - 'a'] = true;
                sb.append(c);
            }
        }
        
        return sb.toString();
    }
}