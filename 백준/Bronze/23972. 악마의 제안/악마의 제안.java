import java.io.*;
import java.util.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        int k = Integer.parseInt(st.nextToken());
        int n = Integer.parseInt(st.nextToken());
        
        long x;
        
        if (n == 1) {
            x = -1;
        } else {
            x = 1l * k * n / (n - 1);
            long y = 1l * k * n % (n - 1);
            if (y > 0L) x++;
        }
        
        System.out.println(x);
    }
}