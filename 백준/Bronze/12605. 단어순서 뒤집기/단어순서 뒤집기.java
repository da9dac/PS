import java.io.*;
import java.util.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int n = Integer.parseInt(br.readLine());
        int num = 1;
        
        StringBuilder sb = new StringBuilder();
        
        while (n-- > 0) {
            String[] strs = br.readLine().split(" ");
            int len = strs.length;
            
            for (int i = 0; i < len / 2; i++) {
                String tmp = strs[i];
                strs[i] = strs[len - 1 - i];
                strs[len - 1 - i] = tmp;
            }
            
            sb.append("Case #").append(num++).append(": ");
            
            for (String str : strs) sb.append(str).append(" ");
            
            sb.append("\n");
        }
        
        System.out.println(sb);
    }
}