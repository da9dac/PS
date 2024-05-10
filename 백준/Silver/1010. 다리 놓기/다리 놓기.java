import java.io.*;
import java.util.*;

class Main {
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();
        
        int[][] comb = new int[31][31];
        
        for(int i = 0; i < 31; i++) {
            for(int j = 0; j < 31; j++){
                if(i < j) continue;
                else if(i == j || j == 0) comb[i][j] = 1;
                else comb[i][j] = comb[i-1][j-1] + comb[i-1][j];
            }
        }

        int t = Integer.parseInt(br.readLine());
        
        while (t-- > 0) {
            st = new StringTokenizer(br.readLine());
            
            int n = Integer.parseInt(st.nextToken());
            int m = Integer.parseInt(st.nextToken());
            
            sb.append(comb[m][n]).append("\n");
        }
        
        System.out.println(sb);
    }
}