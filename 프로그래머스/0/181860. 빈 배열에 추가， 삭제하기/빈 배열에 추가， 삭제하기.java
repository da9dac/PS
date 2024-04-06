import java.util.*;

class Solution {
    public int[] solution(int[] arr, boolean[] flag) {
        int size = 0;
        int idx = 0;
        
        for (int i = 0; i < arr.length; i++) {
            if (flag[i]) size += (arr[i] * 2);
        }
        
        int[] result = new int[size];
        
        for (int i = 0; i < arr.length; i++) {
            if (flag[i]) {
                for (int j = 0; j < arr[i] * 2; j++) {
                    result[idx++] = arr[i];
                }
            } else {
                idx -= arr[i];
            }
        }
        
        return Arrays.copyOfRange(result, 0, idx);
    }
}