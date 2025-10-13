import java.io.*;
import java.util.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();
        
        int t = Integer.parseInt(br.readLine());
        
        int[] priceA = {0, 5000000, 3000000, 2000000, 500000, 300000, 100000};
        int[] priceB = {5120000, 2560000, 1280000, 640000, 320000};
        
        while (t-- > 0) {
            st = new StringTokenizer(br.readLine());
            
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            
            int total = 0;
            int cnt = 0;
            
            for (int i = 1; i <= 6; i++) {
                if (a == 0) break;
                
                cnt += i;
                
                if (cnt >= a) {
                    total += priceA[i];
                    break;
                }
            }
            
            cnt = 0;
            
            for (int i = 0; i < 5; i++) {
                if (b == 0) break;
                
                cnt += Math.pow(2, i);
                
                if (cnt >= b) {
                    total += priceB[i];
                    break;
                }
            }
            
            sb.append(total).append("\n");
        }
        
        System.out.println(sb);
    }
}