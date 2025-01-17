import java.io.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int t = Integer.parseInt(br.readLine());
        
        StringBuilder sb = new StringBuilder();
        
        while (t-- > 0) {
            int n = Integer.parseInt(br.readLine());
            boolean[] arr = new boolean[n + 1];
            
            for (int i = 1; i <= n; i++) {
                for (int j = i; j <= n; j += i) {
                    arr[j] = !arr[j];
                }
            }
            
            int cnt = 0;
            
            for (boolean b : arr) {
                if (b) cnt++;
            }
            
            sb.append(cnt).append("\n");
        }
        
        System.out.println(sb);
    }
}