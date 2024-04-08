class Solution {
    public int[] solution(int[] arr) {
        int[] size = {1, 2, 4, 8, 16, 32, 64, 128, 256, 512, 1024};
        int[] answer = {};
        
        for (int s : size) {
            if (s == arr.length) return arr;
            if (s > arr.length) {
                answer = new int[s];
                
                for (int i = 0; i < arr.length; i++) {
                    answer[i] = arr[i];
                }
                
                break;
            }
        }
        
        return answer;
    }
}