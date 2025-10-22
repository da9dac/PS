import java.io.*;
import java.util.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        int s1 = Integer.parseInt(st.nextToken());
        int s2 = Integer.parseInt(st.nextToken());
        
        String result = "Accepted";
        
        while (s1-- > 0) {
            st = new StringTokenizer(br.readLine());
            
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            
            if (a == b) continue;
            
            result = "Wrong Answer";
        }
        
        if (result.equals("Accepted")) {
            while (s2-- > 0) {
                st = new StringTokenizer(br.readLine());
                
                int a = Integer.parseInt(st.nextToken());
                int b = Integer.parseInt(st.nextToken());
                
                if (a != b) {
                    result = "Why Wrong!!!";
                    break;
                }
            }
        }
        
        System.out.println(result);
    }
}