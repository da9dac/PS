import java.io.*;
import java.util.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int n = Integer.parseInt(br.readLine());
        
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        int[] arr = new int[n];
        
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        
        Arrays.sort(arr);
        
        int min = Integer.MAX_VALUE;
        int cnt = 0;
        
        for (int i = 1; i < n; i++) {
            int x = arr[i] - arr[i - 1];
            
            if (x < min) {
                cnt = 1;
                min = x;
                continue;
            }
            
            if (x == min) {
                cnt++;
            }
        }
        
        System.out.println(min + " " + cnt);
    }
}