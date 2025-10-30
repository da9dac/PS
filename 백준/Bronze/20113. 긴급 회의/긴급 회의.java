import java.io.*;
import java.util.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int n = Integer.parseInt(br.readLine());
        int skip = 0;
        int max = 0;
        
        int[] count = new int[n + 1];
        
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        for (int i = 0; i < n; i++) {
            int x = Integer.parseInt(st.nextToken());
            
            if (x == 0) {
                skip++;
                continue;
            }
            
            count[x]++;
            max = Math.max(max, count[x]);
        }
        
        int soloFlag = 0;
        int target = 0;
        
        for (int i = 1; i <= n; i++) {
            if (count[i] != max) continue;
            
            if (soloFlag == 1) {
                soloFlag = 2;
                break;
            }
            
            soloFlag = 1;
            target = i;
        }
        
        if (soloFlag == 2) {
            System.out.println("skipped");
        } else {
            System.out.println(target);
        }
    }
}