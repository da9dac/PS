import java.io.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int n = Integer.parseInt(br.readLine()) - 1;
        
        int max = Integer.parseInt(br.readLine());
        
        while (n-- > 0) {
            max += Integer.parseInt(br.readLine()) - 1;
        }
        
        System.out.println(max);
    }
}