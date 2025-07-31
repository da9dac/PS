import java.io.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int n = Integer.parseInt(br.readLine());
        long x = 1;
        
        for (int i = 2; i <= n; i++) {
            x *= i;
        }
        
        System.out.println(x / 604800);
    }
}