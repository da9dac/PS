import java.io.*;
import java.util.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        
        int x = 0;
        int max = -1;
        
        for (int i = 1; i <= 5; i++) {
            st = new StringTokenizer(br.readLine());
            
            int sum = 0;
            
            for (int j = 0; j < 4; j++) {
                sum += Integer.parseInt(st.nextToken());
            }
            
            if (max < sum) {
                x = i;
                max = sum;
            }
        }
        
        System.out.println(x + " " + max);
    }
}