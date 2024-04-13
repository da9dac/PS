class Solution {
    public int solution(int[] array) {
        int[] count = new int[1001];
        int max = 0;
        int result = -1;
        
        for (int a : array) {
            count[a]++;
        }
        
        for (int i = 0; i <= 1000; i++) {
            if (max < count[i]) {
                max = count[i];
                result = i;
                continue;
            }
            
            if (max == count[i]) result = -1;
        }
        
        return result;
    }
}