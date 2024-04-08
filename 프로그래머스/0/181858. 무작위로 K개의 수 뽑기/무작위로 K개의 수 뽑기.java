class Solution {
    public int[] solution(int[] arr, int k) {
        int[] answer = new int[k];
        boolean[] isUsed = new boolean[100001];
        int idx = 0;
        
        for (int a : arr) {
            if (isUsed[a]) continue;
            isUsed[a] = true;
            answer[idx++] = a;
            if (idx >= k) break;
        }
        
        for (int i = idx; i < k; i++) {
            answer[i] = -1;
        }
        
        return answer;
    }
}