import java.io.*;
import java.util.*;

class Main {
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        
        st = new StringTokenizer(br.readLine());
        
        int[] arr = new int[n];
        
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        
        int s = 0;
        int e = 0;
        int cnt = 0;
        int sum = 0;
        int max = -200000000;
        
        while (e < n) {
            sum += arr[e++];
            cnt++;
            
            if (cnt == k) {
                max = Math.max(max, sum);
                sum -= arr[s++];
                cnt--;
            }
        }
        
        System.out.println(max);
    }
}