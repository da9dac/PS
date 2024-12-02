import java.io.*;
import java.util.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        int h = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int s = Integer.parseInt(st.nextToken());
        int d = Integer.parseInt(br.readLine());
        
        int totalSeconds = h * 3600 + m * 60 + s + d;
        
        h = (totalSeconds / 3600) % 24;
        m = (totalSeconds % 3600) / 60;
        s = totalSeconds % 60;
        
        System.out.println(h + " " + m + " " + s);
    }
}