class Solution {
    public int[][] solution(int n) {
        int[][] answer =  new int[n][n];

        int num = 1;
        int go = 0;
        int right = 0, left = n - 1, up = 0, down = n - 1;

        while (num <= n * n){
            switch (go) {
                case 0:{
                    for(int i = 0; i < n; i++) {
                        if(answer[right][i] == 0) {
                            answer[right][i] = num;
                            num++;
                        }
                    }
                    right++;
                    go++;
                    break;
                }
                case 1:{
                    for(int i = 0; i < n; i++) {
                        if(answer[i][down] == 0) {
                            answer[i][down] = num;
                            num++;
                        }
                    }
                    down--;
                    go++;
                    break;
                }
                case 2:{
                    for(int i = n - 1; i >= 0; i--) {
                        if(answer[left][i] == 0) {
                            answer[left][i] = num;
                            num++;
                        }
                    }
                    left--;
                    go++;
                    break;
                }
                case 3:{
                    for(int i = n - 1; i >= 0; i--) {
                        if(answer[i][up] == 0) {
                            answer[i][up] = num;
                            num++;
                        }
                    }
                    up++;
                    go = 0;
                    break;
                }

            }
        }
        return answer;
    }
}