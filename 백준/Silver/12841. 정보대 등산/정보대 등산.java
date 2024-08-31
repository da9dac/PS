import java.io.*;
import java.util.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int n = Integer.parseInt(br.readLine());
        
        int[] cross = new int[n];
        long[] leftSum = new long[n];
        long[] rightSum = new long[n];
        
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        for (int i = 0; i < n; i++) {
            cross[i] = Integer.parseInt(st.nextToken());
        }
        
        st = new StringTokenizer(br.readLine());
        
        for (int i = 1; i < n; i++) {
            leftSum[i] = leftSum[i - 1] + Integer.parseInt(st.nextToken());
        }
        
        st = new StringTokenizer(br.readLine());
        
        for (int i = 1; i < n; i++) {
            rightSum[i] = rightSum[i - 1] + Integer.parseInt(st.nextToken());
        }
        
        long min = Long.MAX_VALUE;
        int num = 0;
        
        for (int i = 0; i < n; i++) {
            long x = leftSum[i] + cross[i] + rightSum[n - 1] - rightSum[i];
            
            if (x < min) {
                num = i + 1;
                min = x;
            }
        }
        
        System.out.println(num + " " + min);
    }
}