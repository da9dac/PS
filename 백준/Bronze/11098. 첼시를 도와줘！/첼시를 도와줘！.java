import java.io.*;
import java.util.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();
        
        int n = Integer.parseInt(br.readLine());
        
        while (n-- > 0) {
            int p = Integer.parseInt(br.readLine());
            int max = 0;
            String name = "";
            
            while (p-- > 0) {
                st = new StringTokenizer(br.readLine());
                
                int c = Integer.parseInt(st.nextToken());
                
                if (max < c) {
                    max = c;
                    name = st.nextToken();
                }
            }
            
            sb.append(name).append("\n");
        }
        
        System.out.println(sb);
    }
}