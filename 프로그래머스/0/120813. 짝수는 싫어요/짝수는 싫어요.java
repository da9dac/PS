class Solution {
    public int[] solution(int n) {
         int length = n / 2 + 1;
        if (n % 2 == 0) {
            length = n / 2;
        }
        int[] answer = new int[length];
        int count = 0;

        for (int i = 1; i <= n; i++) {
            if (i % 2 != 0) {
                answer[count] = i;
                count++;
            }
        }
        return answer;
    }
}