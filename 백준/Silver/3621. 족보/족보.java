import java.io.*;
import java.util.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        int n = Integer.parseInt(st.nextToken());
        int d = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        
        int[] counts = new int[n + 1];
        
        for (int i = 0; i < n; i++) {
            int x = Integer.parseInt(st.nextToken());
            counts[x]++;
        }
        
        int cnt = 0;
        
        for (int i = 0; i < n; i++) {
            while (counts[i] > d) {
                cnt++;
                counts[i] -= d - 1;
            }
        }
        
        System.out.println(cnt);
    }
}