import java.util.*;
import java.io.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int n = Integer.parseInt(br.readLine());
        
        int[] arr = new int[n];
        
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        boolean isUp = true;
        int prev = 0;
        String result = "YES";
        
        for (int i = 0; i < n; i++) {
            int a = Integer.parseInt(st.nextToken());
            
            if (a == prev) {
                result = "NO";
            }
            
            if (isUp) {
                if (a < prev) {
                    isUp = false;
                }
                
                prev = a;
            } else {
                if (a > prev) {
                    result = "NO";
                    break;
                }
                
                prev = a;
            }
        }
        
        System.out.println(result);
    }
}