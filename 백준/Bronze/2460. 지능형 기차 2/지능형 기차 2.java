import java.io.*;
import java.util.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        
        int max = 0;
        int cur = 0;
        
        for (int i = 0; i < 10; i++) {
            st = new StringTokenizer(br.readLine());
            
            cur -= Integer.parseInt(st.nextToken());
            cur += Integer.parseInt(st.nextToken());
            
            max = Math.max(max, cur);
        }
        
        System.out.println(max);
    }
}