import java.util.*;

class Solution {
    public int[] solution(int[] emergency) {
        int[] arr = emergency.clone();
        
        Arrays.sort(arr);
        
        int[] answer = new int[emergency.length];
        
        for (int i = 0; i < emergency.length; i++) {
            int cnt = 1;
            for (int j = emergency.length - 1; j >= 0; j--) {
                if (emergency[i] == arr[j]) {
                    answer[i] = cnt;
                    break;
                }
                cnt++;
            }
        }
        
        return answer;
    }
}