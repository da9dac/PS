import java.util.*;

class Solution {
    public int[] solution(int[] arr) {
        int cnt = 0;
        int start = -1;
        
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 2) {
                if (start == -1) start = i;
                cnt++;
            }
        }
        
        if (start == -1) return new int[]{-1};
        
        ArrayList<Integer> list = new ArrayList<>();
        
        for (int i = start; i < arr.length; i++) {
            list.add(arr[i]);
            if (arr[i] == 2) cnt--;
            if (cnt == 0) break;
        }
        
        return list.stream().mapToInt(i -> i).toArray();
    }
}