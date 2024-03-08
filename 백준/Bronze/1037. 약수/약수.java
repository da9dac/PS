import java.io.*;
import java.util.*;

class Main {
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        int max = 0, min = 1000001;
        
        while (n-- > 0) {
            int x = Integer.parseInt(st.nextToken());
            
            if(x > max) max = x;
            if(x < min) min = x;
        }
        
        System.out.println(max * min);
    }
}