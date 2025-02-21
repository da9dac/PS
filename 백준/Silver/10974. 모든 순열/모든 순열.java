import java.io.*;

class Main {
    
    static int n;
    static boolean[] isUsed = new boolean[9];
    static int[] seq = new int[9];
    static StringBuilder sb = new StringBuilder();
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        n = Integer.parseInt(br.readLine());
        
        solve(0);
        
        System.out.println(sb);
    }
    
    static void solve(int size) {
        if (size == n) {
            for (int i = 0; i < size; i++) {
                sb.append(seq[i]).append(" ");
            }
            
            sb.append("\n");
            return;
        }
        
        for (int i = 1; i <= n; i++) {
            if (isUsed[i]) continue;
            isUsed[i] = true;
            seq[size] = i;
            solve(size + 1);
            isUsed[i] = false;
        }
    }
}