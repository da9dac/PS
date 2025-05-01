import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        int n = Integer.parseInt(st.nextToken());
        int d = Integer.parseInt(st.nextToken());
        int cnt = 0;
        
        for (int i = 1; i <= n; i++) {
            int x = i;
            
            while (x > 0) {
                if (x % 10 == d) cnt++;
                x /= 10;
            }
        }
        
        System.out.println(cnt);
    }
}
