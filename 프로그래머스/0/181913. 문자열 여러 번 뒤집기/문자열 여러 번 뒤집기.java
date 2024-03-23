class Solution {
    char[] chars;
    
    public String solution(String my_string, int[][] queries) {
        chars = my_string.toCharArray();
        
        for (int[] query : queries) {
            reverse(query[0], query[1]);
        }
        
        return new String(chars);
    }
    
    void reverse(int st, int ed) {
        int mid = (st + ed + 1) / 2;
        
        while(st < mid) {
            char tmp = chars[st];
            chars[st++] = chars[ed];
            chars[ed--] = tmp;
        }
    }
}