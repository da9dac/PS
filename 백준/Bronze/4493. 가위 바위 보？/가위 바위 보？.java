import java.io.*;
import java.util.*;

class Main {
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();
        
        int t = Integer.parseInt(br.readLine());
        
        while(t-- > 0) {
            int n = Integer.parseInt(br.readLine());
            int cnt = 0;
            
            for (int i = 0; i < n; i++) {
                st = new StringTokenizer(br.readLine());
                
                String x = st.nextToken();
                String y = st.nextToken();
                
                if (x.equals(y)) continue;
                
                if (x.equals("R")) {
                    cnt += (y.equals("P") ? -1 : 1);
                } else if (x.equals("P")) {
                    cnt += (y.equals("S") ? -1 : 1);
                } else {
                    cnt += (y.equals("R") ? -1 : 1);
                }
            }
            
            sb.append(cnt == 0 ? "TIE" : cnt > 0 ? "Player 1" : "Player 2").append("\n");
        }
        
        System.out.println(sb);
    }
}