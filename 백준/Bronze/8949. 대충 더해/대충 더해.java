import java.io.*;
import java.util.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        String a = st.nextToken();
        String b = st.nextToken();
        
        int al = a.length();
        int bl = b.length();
        int ml = Math.max(al, bl);
        
        int[] arr = new int[ml];
        
        for (int i = 0; i < al; i++) {
            arr[ml - al + i] += a.charAt(i) - '0';
        }
        
        for (int i = 0; i < bl; i++) {
            arr[ml - bl + i] += b.charAt(i) - '0';
        }
        
        StringBuilder sb = new StringBuilder();
        
        for (int i : arr) {
            sb.append(i);
        }
        
        System.out.println(sb);
    }
}