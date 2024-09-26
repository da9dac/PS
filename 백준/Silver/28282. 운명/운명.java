import java.io.*;
import java.util.*;

public class Main {
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        long X = Long.parseLong(st.nextToken());
        long K = Long.parseLong(st.nextToken());

        long[] L = new long[10001];
        long[] R = new long[10001];
        long ans = 0;
        
        st = new StringTokenizer(br.readLine());

        for (int i = 0; i < X; i++) {
            int x = Integer.parseInt(st.nextToken());
            L[x]++;
        }

        for (int i = 0; i < X; i++) {
            int x = Integer.parseInt(st.nextToken());
            R[x]++;
        }

        ans = X * X;

        for (int i = 1; i <= K; i++) {
            ans -= L[i] * R[i];
        }

        System.out.println(ans);
    }
}