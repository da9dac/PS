class Solution {
    public String solution(String my_string, int[] indices) {
        StringBuilder sb = new StringBuilder();
        
        int len = my_string.length();
        
        boolean[] isPassed = new boolean[len];
        
        for (int i : indices) isPassed[i] = true;
        
        for (int i = 0; i < len; i++) {
            if (!isPassed[i]) sb.append(my_string.charAt(i));
        }
        
        return sb.toString();
    }
}