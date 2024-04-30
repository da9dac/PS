import java.io.*;
import java.util.*;

class Main {
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;
        
        int t = Integer.parseInt(br.readLine());
        
        while (t-- > 0) {
            st = new StringTokenizer(br.readLine());
            
            int x = Integer.parseInt(st.nextToken()) - 1;
            String s = st.nextToken();
            int len = s.length();
            
            for (int i = 0; i < x; i++) sb.append(s.charAt(i));
            for (int i = x + 1; i < len; i++) sb.append(s.charAt(i));
            sb.append("\n");
        }
        
        System.out.println(sb);
    }
}