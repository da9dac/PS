import java.io.*;
import java.util.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        int a = Integer.parseInt(st.nextToken()) / 2;
        int b = Integer.parseInt(st.nextToken());
        
        int result = Math.min(a, b);
        
        System.out.println(result);
    }
}