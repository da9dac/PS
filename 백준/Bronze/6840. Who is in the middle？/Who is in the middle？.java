import java.io.*;
import java.util.*;

class Main {
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int[] arr = new int[3];
        
        for (int i = 0; i < 3; i++) {
            int n = Integer.parseInt(br.readLine());
            arr[i] = n;
        }
        
        Arrays.sort(arr);
        
        System.out.println(arr[1]);
    }
}