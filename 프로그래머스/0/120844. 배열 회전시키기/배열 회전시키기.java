import java.util.ArrayList;
class Solution {
    public int[] solution(int[] numbers, String direction) {
        int len = numbers.length;
        int idx = 0;
        int[] answer = new int[len];
        
        if (direction.equals("right")) {
            answer[idx++] = numbers[len - 1];
            
            for (int i = 0; i < len - 1; i++) {
                answer[idx++] = numbers[i];
            }
        } else {
            answer[len - 1] = numbers[0];
            
            for (int i = 1; i < len; i++) {
                answer[idx++] = numbers[i];
            }
        }
        
        return answer;
    }
}