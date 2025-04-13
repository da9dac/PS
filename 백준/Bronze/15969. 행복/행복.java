import java.io.*;
import java.util.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int n = Integer.parseInt(br.readLine());
        int max = 0;
        int min = 1000;
        
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        while (n-- > 0) {
            int score = Integer.parseInt(st.nextToken());
            
            max = Math.max(max, score);
            min = Math.min(min, score);
        }
        
        System.out.println(max - min);
    }
}