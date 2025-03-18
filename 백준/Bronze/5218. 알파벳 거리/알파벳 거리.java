import java.io.*;
import java.util.*;

class Main {
    
    static final String DIST = "Distances: ";

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        
        int t = Integer.parseInt(br.readLine());
        
        StringBuilder sb = new StringBuilder();
        
        while (t-- > 0) {
            st = new StringTokenizer(br.readLine());
            
            String w1 = st.nextToken();
            String w2 = st.nextToken();
            
            int len = w1.length();
            
            sb.append(DIST);
            
            for (int i = 0; i < len; i++) {
                char c1 = w1.charAt(i);
                char c2 = w2.charAt(i);
                
                if (c1 <= c2) {
                    sb.append((int)(c2 - c1)).append(" ");
                } else {
                    sb.append((int)(c2 + 26 - c1)).append(" ");
                }
            }
            
            sb.append("\n");
        }
        
        System.out.println(sb);
	}
}
