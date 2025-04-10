import java.io.*;
import java.util.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        int n = Integer.parseInt(st.nextToken());
        String l = st.nextToken();
        
        int num = 1;
        String s;
        
        for (int i = 1; ; i++) {
            if (String.valueOf(i).contains(l)) continue;
            n--;
            if (n == 0) {
                System.out.println(i);
                break;
            }
        }
    }
}