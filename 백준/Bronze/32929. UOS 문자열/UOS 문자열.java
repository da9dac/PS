import java.io.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int x = Integer.parseInt(br.readLine());
        
        String s = "UOS";
        
        System.out.println(s.charAt((x - 1) % 3));
    }
}