class Solution {
    public int[][] solution(int[] num_list, int n) {
        int[][] answer = new int[num_list.length/n][n];
        int idx = 0;

        for (int x = 0; x < answer.length; x++) {
            for (int y = 0; y < n; y++) {
                answer[x][y] = num_list[idx];
                idx++;
            }
        }
        return answer;
    }
}