import java.io.*;

class Main {
    
    static final long MOD = (long)1e12;
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        
        int n = Integer.parseInt(br.readLine());
        long f = 1;
        
        for (int i = 2; i <= n; i++) {
            f *= i;
            
            while (f % 10 == 0) {
                f /= 10;
            }
            
            f %= MOD;
        }
        
        f %= 100000;
        
        if (f < 10) sb.append("0000");
        else if (f < 100) sb.append("000");
        else if (f < 1000) sb.append("00");
        else if (f < 10000) sb.append("0");
        
        sb.append(f);
        
        System.out.println(sb);
    }
}