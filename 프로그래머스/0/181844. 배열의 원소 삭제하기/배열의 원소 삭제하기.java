import java.util.*;

class Solution {
    public int[] solution(int[] arr, int[] delete_list) {
        Arrays.sort(delete_list);
        
        ArrayList<Integer> result = new ArrayList<>();
        
        for (int a : arr) {
            if (Arrays.binarySearch(delete_list, a) < 0) result.add(a);
        }
        
        return result.stream().mapToInt(i -> i).toArray();
    }
}