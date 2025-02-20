import java.io.*;
import java.util.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        char[] arr = br.readLine().toCharArray();
        int[] values = {3, 2, 1, 2, 3, 3, 3, 3, 1, 1, 3, 1, 3, 3, 1, 2, 2, 2, 1, 2, 1, 1, 2, 2, 2, 1};

        Queue<Integer> q = new ArrayDeque<>();
        
        for (char c : arr) {
            q.offer(values[c - 'A']);
        }
        
        while (q.size() > 1) {
            int sum = q.poll() + q.poll();
            q.offer(sum > 10 ? sum % 10 : sum);
        }
        
        System.out.println(q.poll() % 2 != 0 ? "I'm a winner!" : "You're the winner?");
    }
}