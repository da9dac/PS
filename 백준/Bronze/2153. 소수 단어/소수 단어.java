import java.io.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        
        int sum = 0;
        
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            int x = c <= 'Z' ? c - 'A' + 27 : c - 'a' + 1;
            sum += x;
        }
        
        System.out.println(isPrime(sum) ? 
            "It is a prime word." : "It is not a prime word.");
    }
    
    private static boolean isPrime(int n) {
        if (n <= 0) return false;
        if (n == 1) return true;
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) return false;
        }
        return true;
    }
}
