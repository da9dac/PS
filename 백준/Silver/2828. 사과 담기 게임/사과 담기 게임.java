import java.io.*;
import java.util.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int j = Integer.parseInt(br.readLine());
        
        int s = 1;
        int move = 0;
        
        for (int i = 0; i < j; i++) {
            int x = Integer.parseInt(br.readLine());

            
            if (x < s) {
                move += s - x;
                s = x;
                continue;
            }
            
            int w = s + m - 1;
            
            if (x > w) {
                int z = x - w;
                move += z;
                s += z;
                continue;
            }
        }
        
        System.out.println(move);
        
        
    }
}