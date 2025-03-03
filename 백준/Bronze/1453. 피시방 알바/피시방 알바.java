import java.io.*;
import java.util.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int n = Integer.parseInt(br.readLine());
        
        boolean[] isUsed = new boolean[101];
        
        int cnt = 0;
        
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        while (n-- > 0) {
            int x = Integer.parseInt(st.nextToken());
            
            if (isUsed[x]) {
                cnt++;
                continue;
            }
            
            isUsed[x] = true;
        }
        
        System.out.println(cnt);
    }
}