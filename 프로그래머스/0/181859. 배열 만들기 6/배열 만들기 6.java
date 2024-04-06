import java.util.*;

class Solution {
    public int[] solution(int[] arr) {
        int[] stk = new int[arr.length];
        
        int idx = 0;
        
        for (int i = 0; i < arr.length; i++) {
            if (idx == 0) {
                stk[idx++] = arr[i];
                continue;
            }
            
            if (stk[idx - 1] == arr[i]) {
                idx--;
                continue;
            }
            
            stk[idx++] = arr[i];
        }
        
        return idx == 0 ? new int[]{-1} : Arrays.copyOfRange(stk, 0, idx);
    }
}