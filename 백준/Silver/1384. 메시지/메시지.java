import java.io.*;
import java.util.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();
        final String NOBODY = "Nobody was nasty";
        
        int group = 1;
        
        while (true) {
            int n = Integer.parseInt(br.readLine());
            
            if (n == 0) break;
            
            String[][] arr = new String[n][n];
            
            sb.append("Group").append(" ").append(group++).append("\n");
            
            for (int i = 0; i < n; i++) {
                st = new StringTokenizer(br.readLine());
                
                for (int j = 0; j < n; j++) {
                    arr[i][j] = st.nextToken();
                }
            }
            
            boolean isNobody = true;
            
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    if (arr[i][j].equals("N")) {
                        isNobody = false;
                        if (i < j) {
                            sb.append(arr[n - (j - i)][0]).append(" was nasty about ").append(arr[i][0]).append("\n");
                        } else {
                            sb.append(arr[i - j][0]).append(" was nasty about ").append(arr[i][0]).append("\n");
                        }
                    }
                }
            }
            
            if (isNobody) sb.append(NOBODY).append("\n");
            
            sb.append("\n");
        }
        
        System.out.println(sb);
    }
}