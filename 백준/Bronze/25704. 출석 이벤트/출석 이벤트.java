import java.io.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int p = Integer.parseInt(br.readLine());
        
        int minPrice = p;
        
        if (n >= 5) {
            minPrice = Math.min(minPrice, p - 500);
        }
        if (n >= 10) {
            minPrice = Math.min(minPrice, (int)(p * 0.9));
        }
        if (n >= 15) {
            minPrice = Math.min(minPrice, p - 2000);
        }
        if (n >= 20) {
            minPrice = Math.min(minPrice, (int)(p * 0.75));
        }
        
        System.out.println(Math.max(minPrice, 0));
    }
}
