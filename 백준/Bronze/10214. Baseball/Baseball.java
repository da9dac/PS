import java.io.*;
import java.util.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();
        
        int t = Integer.parseInt(br.readLine());
        
        while (t-- > 0) {
            int y = 0;
            int k = 0;
            
            for (int i = 0; i < 9; i++) {
                st = new StringTokenizer(br.readLine());
                
                y += Integer.parseInt(st.nextToken());
                k += Integer.parseInt(st.nextToken());
            }
            
            sb.append(y > k ? "Yonsei" : y < k ? "Korea" : "Draw").append("\n");
        }
        
        System.out.println(sb);
    }
}