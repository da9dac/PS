import java.io.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int t = Integer.parseInt(br.readLine());
        
        StringBuilder sb = new StringBuilder();
        
        while (t-- > 0) {
            long n = Integer.parseInt(br.readLine());
            
            long max = n;
            
            while (n != 1) {
                if (n % 2 == 0) n /= 2;
                else {
                    n = n * 3 + 1;
                }
                
                max = Math.max(max, n);
            }
            
            sb.append(max).append("\n");
        }
        
        System.out.println(sb);
    }
}