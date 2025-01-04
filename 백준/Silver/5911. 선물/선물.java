import java.io.*;
import java.util.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        int n = Integer.parseInt(st.nextToken()); // 친구수
        int b = Integer.parseInt(st.nextToken()); // 가진 돈
        
        Gift[] gifts = new Gift[n];
        
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            
            int p = Integer.parseInt(st.nextToken());
            int s = Integer.parseInt(st.nextToken());
            
            gifts[i] = new Gift(p, s);
        }
        
        int max = 0;
        int[] totals = new int[n];
        
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                Gift gift = gifts[j];
                
                if (i == j) {
                    totals[j] = gift.p / 2 + gift.s;
                } else {
                    totals[j] = gift.p + gift.s;
                }
            }
            
            Arrays.sort(totals);
            
            int cnt = 0;
            long sum = 0;
            
            for (int j = 0; j < n; j++) {
                sum += totals[j];
                
                if (sum <= b) cnt++;
                else break;
            }
            
            if (cnt > max) max = cnt;
        }
        
        System.out.println(max);
    }
    
    static class Gift {
        int p, s;
        
        Gift(int p, int s) {
            this.p = p;
            this.s = s;
        }
    }
}