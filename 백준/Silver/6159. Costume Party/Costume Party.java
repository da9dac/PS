import java.io.*;
import java.util.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        int n = Integer.parseInt(st.nextToken());
        int s = Integer.parseInt(st.nextToken());
        int cnt = 0;
        
        int[] cows = new int[n];
        
        for (int i = 0; i < n; i++) {
            cows[i] = Integer.parseInt(br.readLine());
        }
        
        Arrays.sort(cows);
        
        int l = 0;
        int r = n - 1;
        
        while (l < r) {
            int sum = cows[l] + cows[r];
            
            if (sum <= s) {
                cnt += (r - l);
                l++;
            } else {
                r--;
            }
        }
        
        System.out.println(cnt);
    }
}