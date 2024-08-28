import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int length = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        Deque<Integer> deque = new LinkedList<>();
        for(int i = 1; i <= length; i++){
            deque.addLast(i);
        }

        int idx = 0;
        int reverse = 0;
        boolean reverseBoolean = false;

        StringBuilder sb = new StringBuilder();
        while (!deque.isEmpty()){ 
            if(!reverseBoolean && idx != k-1){ 
                idx++;
                deque.addLast(deque.removeFirst()); 
            } else if (!reverseBoolean && idx == k-1) {
                idx = 0;
                reverse++;
                sb.append(deque.removeFirst() + "\n"); 
            } else if (reverseBoolean && idx != k-1) { 
                idx++;
                deque.addFirst(deque.removeLast());
            } else if (reverseBoolean && idx == k-1) {
                idx = 0;
                reverse++;
                sb.append(deque.removeLast() + "\n");
            }
            if(reverse == m && !reverseBoolean) {
                reverse = 0;
                reverseBoolean = true;
            } else if (reverse == m && reverseBoolean) {
                reverse = 0;
                reverseBoolean = false;
            }
        }
        System.out.print(sb);
    }
}