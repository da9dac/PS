import java.io.*;
import java.util.*;

class Main {
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int[] w = new int[10];
        int[] k = new int[10];
        
        for (int i = 0; i < 10; i++) {
            w[i] = Integer.parseInt(br.readLine());
        }
        
        for (int i = 0; i < 10; i++) {
            k[i] = Integer.parseInt(br.readLine());
        }
        
        Arrays.sort(w);
        Arrays.sort(k);
        
        int sw = w[7] + w[8] + w[9];
        int sk = k[7] + k[8] + k[9];
        
        System.out.println(sw + " " + sk);
    }
}