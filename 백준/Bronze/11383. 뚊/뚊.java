import java.io.*;
import java.util.*;

class Main {
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        
        String[] smalls = new String[n];
        String[] bigs = new String[n];
        
        for (int i = 0; i < n; i++) {
            smalls[i] = br.readLine();
        }
        
        for (int i = 0; i < n; i++) {
            bigs[i] = br.readLine();
        }
        
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                char c = smalls[i].charAt(j);
                
                if (c == bigs[i].charAt(j * 2) && c == bigs[i].charAt(j * 2 + 1)) {
                    continue;
                }
                
                System.out.println("Not Eyfa");
                return;
            }
        }
        
        System.out.println("Eyfa");
    }
}