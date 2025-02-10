import java.io.*;
import java.util.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int n = Integer.parseInt(br.readLine());
        
        StringTokenizer a = new StringTokenizer(br.readLine());
        StringTokenizer bc = new StringTokenizer(br.readLine());
        
        int b = Integer.parseInt(bc.nextToken());
        int c = Integer.parseInt(bc.nextToken());
        long cnt = n;
        
        for (int i = 0; i < n; i++) {
            int x = Integer.parseInt(a.nextToken()) - b;
            
            if (x > 0) {
                int d = x % c == 0 ? x / c : x / c + 1;
                cnt += d;
            }
        }
        
        System.out.println(cnt);
    }
}