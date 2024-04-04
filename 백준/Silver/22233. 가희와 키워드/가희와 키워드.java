import java.io.*;
import java.util.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();
        
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        
        Set<String> set = new HashSet<>();
        
        while (n-- > 0) {
            set.add(br.readLine());
        }
        
        while (m-- > 0) {
            st = new StringTokenizer(br.readLine(), ",");
            
            while(st.hasMoreTokens()) {
                set.remove(st.nextToken());
            }
            
            sb.append(set.size()).append("\n");
        }
        
        System.out.println(sb);
    }
}