import java.io.*;
import java.util.*;

class Main {
    
    static int[] arr = new int[101];
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());

        parking(new StringTokenizer(br.readLine()));
        parking(new StringTokenizer(br.readLine()));
        parking(new StringTokenizer(br.readLine()));
        
        int cost = 0;
        
        for (int x : arr) {
            if (x == 1) cost += a;
            else if (x == 2) cost += b * x;
            else if (x == 3) cost += c * x;
        }
        
        System.out.println(cost);
    }
    
    static void parking(StringTokenizer st) {
        int x = Integer.parseInt(st.nextToken());
        int y = Integer.parseInt(st.nextToken());
        
        for (int i = x; i < y; i++) arr[i]++;
    }
}