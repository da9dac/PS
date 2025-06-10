import java.io.*;
import java.util.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        int bx = Integer.parseInt(st.nextToken());
        int by = Integer.parseInt(st.nextToken());
        
        st = new StringTokenizer(br.readLine());
        
        int dx = Integer.parseInt(st.nextToken());
        int dy = Integer.parseInt(st.nextToken());
        
        st = new StringTokenizer(br.readLine());
        
        int jx = Integer.parseInt(st.nextToken());
        int jy = Integer.parseInt(st.nextToken());
        
        int b = Math.max(Math.abs(jx - bx), Math.abs(jy - by));
        int d = Math.abs(jx - dx) + Math.abs(jy - dy);
        
        System.out.println(b == d ? "tie" : b < d ? "bessie" : "daisy");
    }
}