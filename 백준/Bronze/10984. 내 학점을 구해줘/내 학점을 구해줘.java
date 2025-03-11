import java.io.*;
import java.util.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        
        int t = Integer.parseInt(br.readLine());
        
        StringBuilder sb = new StringBuilder();
        
        while (t-- > 0) {
            int n = Integer.parseInt(br.readLine());
            
            int x = 0;
            double sum = 0.0;
            
            while (n-- > 0) {
                st = new StringTokenizer(br.readLine());

                int c = Integer.parseInt(st.nextToken());
                double g = Double.parseDouble(st.nextToken());
                
                x += c;
                sum += (g * c);
            }
            
            sb.append(x).append(" ").append(String.format("%.2f", sum / x)).append("\n");
        }
        
        System.out.println(sb);
    }
}