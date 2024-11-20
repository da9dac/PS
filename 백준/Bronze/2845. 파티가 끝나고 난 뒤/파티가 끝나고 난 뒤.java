import java.io.*;
import java.util.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        int l = Integer.parseInt(st.nextToken());
        int p = Integer.parseInt(st.nextToken());
        
        int sum = l * p;
        
        st = new StringTokenizer(br.readLine());
        
        for (int i = 0; i < 5; i++) {
            int x = Integer.parseInt(st.nextToken());
            
            sb.append(x - sum).append(" ");
        }
        
        System.out.println(sb);
    }
}