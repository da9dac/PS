class Solution {
    public int[][] solution(int[][] arr) {
        int n = arr.length;
		int m = arr[0].length;

		int[][] answer;

		if (n > m) answer = new int[n][n];
		else answer = new int[m][m];
		
		
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				answer[i][j] = arr[i][j];
			}
		}

		return answer;
    }
}