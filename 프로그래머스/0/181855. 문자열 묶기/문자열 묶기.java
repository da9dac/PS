class Solution {
    public int solution(String[] strArr) {
        int[] counts = new int[31];
        
        int max = 0;
        
        for (String str : strArr) {
            counts[str.length()]++;
            max = Math.max(max, counts[str.length()]);
        }
        
        return max;
    }
}