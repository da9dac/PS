import java.io.*;
import java.util.*;

class Main {
    static int n, m, max = 0;
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        
        st = new StringTokenizer(br.readLine());
        
        PriorityQueue<Integer> left = new PriorityQueue<>(Collections.reverseOrder());
        PriorityQueue<Integer> right = new PriorityQueue<>(Collections.reverseOrder());
        
        for (int i = 0; i < n; i++) {
            int book = Integer.parseInt(st.nextToken());
            if (book < 0) {
                book *= -1;
                left.offer(book);
            } else {
                right.offer(book);
            }
            
            max = Math.max(max, book);
        }
        
        int sum = 0;
        
        while (true) {
            if (left.isEmpty() && right.isEmpty()) break;
            
            if (right.isEmpty() || (!left.isEmpty() && left.peek() < right.peek())) {
                sum += move(left);
            } else {
                sum += move(right);
            }
        }
        
        System.out.println(sum);
    }
    
    static int move(PriorityQueue<Integer> pq) {
        int x = pq.peek();
        
        for (int i = 0; i < m; i++) {
            if (pq.isEmpty()) break;
            pq.poll();
        }
        
        return x == max ? x : x * 2;
    }
}