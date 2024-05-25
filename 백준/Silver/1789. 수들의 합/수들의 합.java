import java.io.*;

class Main {
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        long n = Long.parseLong(br.readLine());
        long sum = 0;
        
        if (n == 1) {
            System.out.println(1);
            return;
        }
        
        for (long i = 1; i <= n; i++) {
            sum += i;
            if (sum > n) {
                System.out.println(i - 1);
                break;
            }
        }
    }
}