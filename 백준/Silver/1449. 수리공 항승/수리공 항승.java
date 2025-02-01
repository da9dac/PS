import java.io.*;
import java.util.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        int n = Integer.parseInt(st.nextToken());
        int l = Integer.parseInt(st.nextToken());
        
        int[] pipes = new int[n];
        
        st = new StringTokenizer(br.readLine());
        
        for (int i = 0; i < n; i++) {
            pipes[i] = Integer.parseInt(st.nextToken());
        }
        
        Arrays.sort(pipes);
        
        double start = pipes[0] - 0.5;
        double end = start + l;
        int cnt = 1;
        
        for (int i = 1; i < n; i++) {
            int cur = pipes[i];
            
            if (cur + 0.5 <= end) continue;
            
            cnt++;
            start = cur - 0.5;
            end = start + l;
        }
        
        System.out.println(cnt);
    }
}