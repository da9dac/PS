import java.io.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int n = Integer.parseInt(br.readLine());
        
        int cnt = 0;
        
        while (n / 10 != 0) {
            cnt++;
            
            int x = 1;
            int repeat = String.valueOf(n).length();
            
            while (repeat-- > 0) {
                x *= n % 10;
                n /= 10;
            }
            
            n = x;
        }
        
        System.out.println(cnt);
    }
}