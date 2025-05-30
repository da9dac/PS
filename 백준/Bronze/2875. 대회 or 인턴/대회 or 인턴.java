import java.io.*;
import java.util.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        
        int answer = 0;
        
        while (n >= 2 && m >= 1 && (n + m) - k >= 3) {
            answer++;
            n -= 2;
            m--;
        }
        System.out.println(answer);
        
    }
}