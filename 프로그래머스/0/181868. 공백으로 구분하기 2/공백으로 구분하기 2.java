import java.util.*;

class Solution {
    public String[] solution(String my_string) {
        String[] arr = my_string.split(" +");
        return arr[0].isEmpty() ? Arrays.copyOfRange(arr, 1, arr.length) : arr;
    }
}