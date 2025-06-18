import java.io.*;
import java.util.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        int t = Integer.parseInt(st.nextToken());
        boolean isDrink = st.nextToken().equals("1");
        
        System.out.println((t >= 12 && t <= 16 && !isDrink) ? 320 : 280);
    }
}