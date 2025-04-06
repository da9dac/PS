import java.io.*;
import java.util.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        int max = 0;
        
        for (int i = 1; i <= k; i++) {
            char[] nums = String.valueOf(n * i).toCharArray();
            int sum = 0;
            
            for (int j = nums.length - 1; j >= 0; j--) {
                sum *= 10;
                sum += (nums[j] - '0');
            } 
            
            max = Math.max(max, sum);
        }
        
        System.out.println(max);
    }
}