import java.io.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int h = Integer.parseInt(br.readLine());
        int w = Integer.parseInt(br.readLine());
        
        int result = Math.min(h, w) * 50;
        
        System.out.println(result);
    }
}