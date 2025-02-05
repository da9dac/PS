import java.io.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int n = 1 << Integer.parseInt(br.readLine());
        
        System.out.println(n);
    }
}