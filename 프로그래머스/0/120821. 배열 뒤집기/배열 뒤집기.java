class Solution {
    public int[] solution(int[] num_list) {
        int st = 0;
        int ed = num_list.length - 1;
        
        while (st < ed) {
            int tmp = num_list[st];
            num_list[st++] = num_list[ed];
            num_list[ed--] = tmp;
        }
        
        return num_list;
    }
}