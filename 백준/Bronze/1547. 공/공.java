import java.io.*;
import java.util.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        
        int m = Integer.parseInt(br.readLine());
        int ball = 1;
        
        while (m-- > 0) {
            st = new StringTokenizer(br.readLine());
            
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());
            
            if (x == ball) ball = y;
            else if (y == ball) ball = x;
        }
        
        System.out.println(ball);
    }
}