import java.io.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int n = Integer.parseInt(br.readLine());
        
        int[] arr = new int[n];
        
        for (int i = 0; i < n; i++) arr[i] = Integer.parseInt(br.readLine());
        
        int cnt = 1;
        int cur = arr[0];
        
        for (int i = 1; i < n; i++) {
            int x = arr[i];
            
            if (cur < x) {
                cnt++;
                cur = x;
            }
        }
        
        StringBuilder sb = new StringBuilder();
        
        sb.append(cnt).append("\n");
        
        cnt = 1;
        cur = arr[n - 1];
        
        for (int i = n - 2; i >= 0; i--) {
            int x = arr[i];
            
            if (cur < x) {
                cnt++;
                cur = x;
            }
        }
        
        sb.append(cnt);
        
        System.out.println(sb);
    }
}