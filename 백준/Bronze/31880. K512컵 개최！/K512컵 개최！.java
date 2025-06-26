import java.io.*;
import java.util.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        
        long sum = 0;
        
        st = new StringTokenizer(br.readLine());
        
        for (int i = 0; i < n; i++) {
            sum += Integer.parseInt(st.nextToken());
        }
        
        st = new StringTokenizer(br.readLine());
        
        for (int i = 0; i < m; i++) {
            int x = Integer.parseInt(st.nextToken());
            
            if (x != 0) sum *= x;
        }
        
        System.out.println(sum);
    }
}