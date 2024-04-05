import java.io.*;
import java.util.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();
        
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        int cnt = 0, total = 0;
        
        Queue<Integer> q = new ArrayDeque<>();
        
        for (int i = 1; i <= n; i++) {
            q.offer(i);
        }
        
        sb.append("<");
        
        while (!q.isEmpty()) {
            cnt++;
            
            if (cnt == k) {
                sb.append(q.poll());
                cnt = 0;
                total++;
                
                if (total != n) {
					sb.append(", ");
				}
            } else {
                q.offer(q.poll());
            }
        }
        
        sb.append(">");
        
        System.out.println(sb);
    }
}