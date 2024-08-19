import java.io.*;
import java.util.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int n = Integer.parseInt(br.readLine());
        
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        int[] honey = new int[n + 1];
        int[] sum = new int[n + 1];
        
        for (int i = 1; i <= n; i++) {
            honey[i] = Integer.parseInt(st.nextToken());
            sum[i] = sum[i - 1] + honey[i];
        }
        
        int max = 0;
        
        for (int i = 2; i < n; i++) {
            max = Math.max(max, sum[n - 1] - honey[i] + sum[i] - honey[i]);
            max = Math.max(max, sum[i] - honey[1] + sum[n - 1] - sum[i - 1]);
            max = Math.max(max, sum[n] - honey[1] - honey[i] + sum[n] - sum[i]);
        }
        
        System.out.println(max);
    }
}