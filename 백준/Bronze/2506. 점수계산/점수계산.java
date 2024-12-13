import java.io.*;
import java.util.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int n = Integer.parseInt(br.readLine());
        
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        int score = 0;
        int bonus = 1;
        
        while (n-- > 0) {
            if (Integer.parseInt(st.nextToken()) == 0) {
                bonus = 1;
            } else {
                score += bonus++;
            }
        }
        
        System.out.println(score);
    }
}