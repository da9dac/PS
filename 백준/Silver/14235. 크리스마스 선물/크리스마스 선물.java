import java.io.*;
import java.util.*;

class Main {
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();
        
        int n = Integer.parseInt(br.readLine());
        
        PriorityQueue<Integer> pq = new PriorityQueue<>(Comparator.reverseOrder());
        
        while (n-- > 0) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            
            if (a == 0) {
                if (pq.isEmpty()) {
                    sb.append(-1).append("\n");
                    continue;
                }
                sb.append(pq.poll()).append("\n");
            } else {
                while (a-- > 0) {
                    pq.offer(Integer.parseInt(st.nextToken()));
                }
            }
        }
        
        System.out.println(sb);
    }
}