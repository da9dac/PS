import java.util.*;

class Solution {
    public int solution(int[] rank, boolean[] attendance) {
        PriorityQueue<int[]> q = new PriorityQueue<>((x, y) -> x[1] - y[1]);
        
        for (int i = 0; i < rank.length; i++) {
            if (attendance[i]) q.offer(new int[]{i, rank[i]});
        }
        
        return 10000 * q.poll()[0] + 100 * q.poll()[0] + q.poll()[0];
    }
}