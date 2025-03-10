import java.io.*;
import java.util.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        int e = Integer.parseInt(st.nextToken());
        int f = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());
        int t = e + f;
        int cnt = 0;
        
        while (t >= c) {
            int x = t / c;
            cnt += x;
            t %= c;
            t += x;
        }
        
        System.out.println(cnt);
    }
}