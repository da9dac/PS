import java.io.*;
import java.util.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        
        if (n == 0) {
            System.out.println(0);
            return;
        }
        
        int cnt = 1;
        int cur = m;
        
        st = new StringTokenizer(br.readLine());
        
        while (n-- > 0) {
            int x = Integer.parseInt(st.nextToken());
            
            if (x <= cur) {
                cur -= x;
            } else {
                cnt++;
                cur = m - x;
            }
        }
        
        System.out.println(cnt);
    }
}