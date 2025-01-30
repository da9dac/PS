import java.io.*;
import java.util.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();
        
        int t = Integer.parseInt(br.readLine());
        int[] day = {0, 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        
        while (t-- > 0) {
            st = new StringTokenizer(br.readLine());
            
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());
            
            boolean isTime = x < 24 && y < 60;
            boolean isDate;
            
            if (x > 0 && x < 13) {
                isDate = y > 0 && y <= day[x];
            } else {
                isDate = false;
            }
            
            sb.append(isTime ? "Yes" : "No").append(" ");
            sb.append(isDate ? "Yes" : "No").append("\n");
        }
        
        System.out.println(sb);
    }
}