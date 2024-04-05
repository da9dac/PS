class Solution {
    public String solution(String rny_string) {
        int len = 0;
        int idx = 0;
        
        char[] chars = rny_string.toCharArray();
        
        for (int i = 0; i < chars.length; i++) {
            if (rny_string.charAt(i) == 'm') len += 2;
            else len++;
        }
        
        char[] rn = new char[len];
        
        for (char c : chars) {
            if (c == 'm') {
                rn[idx++] = 'r';
                rn[idx++] = 'n';
            } else {
                rn[idx++] = c;
            }
        }
        
        return new String(rn);
    }
}