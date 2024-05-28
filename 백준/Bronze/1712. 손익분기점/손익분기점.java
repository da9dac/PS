import java.io.*;

public class Main {
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] arr = br.readLine().split(" ");
        
        int a = Integer.parseInt(arr[0]);
        int b = Integer.parseInt(arr[1]);
        int c = Integer.parseInt(arr[2]);
        
        if (b >= c) System.out.println(-1);
        else {
            int cnt = 0;
            int x = c - b;
            
            while (a >= 0) {
                a -= x;
                cnt++;
            }
            
            System.out.println(cnt);
        }
    }
}