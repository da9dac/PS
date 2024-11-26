import java.io.*;
import java.util.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        
        int n = Integer.parseInt(br.readLine());
        int len = 0;
        
        String[] arr = new String[n];
        
        for (int i = 0; i < n; i++) {
            String s = br.readLine();
            arr[i] = s;
            len = Math.max(len, s.length());
        }
        
        int[][] counts = new int[len][26];
        int[] maxCounts = new int[len];
        
        for (String s : arr) {
            for (int i = 0; i < s.length(); i++) {
                int idx = s.charAt(i) - 'a';
                counts[i][idx]++;
                maxCounts[i] = Math.max(maxCounts[i], counts[i][idx]);
            }
        }
        
        for (int i = 0; i < len; i++) {
            int max = maxCounts[i];
            sb.append(i + 1).append(": ");
            for (int j = 0; j < 26; j++) {
                if (counts[i][j] == max) {
                    sb.append((char) ('a' + j)).append(" ");
                }
            }
            sb.append("\n");
        }
        
        System.out.println(sb);
    }
}