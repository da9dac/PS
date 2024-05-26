import java.io.*;
import java.util.*;

class Main {
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int n = Integer.parseInt(br.readLine());
        int cut = (int)Math.round(0.15 * n);
        
        int[] arr = new int[n];
        
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }
        
        Arrays.sort(arr);
        
        double sum = 0;
        
        for (int i = cut; i < n - cut; i++) sum += arr[i];
        
        System.out.println(Math.round(sum / (n - cut * 2)));
    }
}