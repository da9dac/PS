import java.util.*;

class Solution {
    public int[] solution(int[] emergency) {
        int[][] arr = new int[emergency.length][2];
        
        for (int i = 0; i < emergency.length; i++) {
            arr[i] = new int[]{emergency[i], i};
        }
        
        Arrays.sort(arr, (a, b) -> {
            return b[0] - a[0];
        });
        
        int[] answer = new int[emergency.length];
        int rank = 1;
        
        for (int i = 0; i < emergency.length; i++) {
            answer[arr[i][1]] = rank++;
        }
        
        return answer;
    }
}