import java.io.*;
import java.util.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int cnt = 0;
        int cur = 0;
        
        int n = Integer.parseInt(br.readLine());
        
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        for (int i = 0; i < n; i++) {
            int milk = Integer.parseInt(st.nextToken());
            
            if (milk == cur) {
                cnt++;
                cur++;
                if (cur == 3) cur = 0;
            }
        }
        
        System.out.println(cnt);
    }
}