import java.io.*;
import java.util.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        
        int n = Integer.parseInt(br.readLine());
        
        StringBuilder sb = new StringBuilder();
        
        while (n-- > 0) {
            st = new StringTokenizer(br.readLine());
            
            char[] a = st.nextToken().toCharArray();
            char[] b = st.nextToken().toCharArray();
            
            int[] cnts = new int[26];
            
            for (char c : a) cnts[c - 'a']++;
            for (char c : b) cnts[c - 'a']--;
            
            boolean isFry = true;
            
            for (int cnt : cnts) {
                if (cnt != 0) {
                    isFry = false;
                    break;
                }
            }
            
            sb.append(isFry ? "Possible" : "Impossible").append("\n");
        }
        
        System.out.println(sb);
    }
}