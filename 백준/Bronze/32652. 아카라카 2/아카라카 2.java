import java.io.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int k = Integer.parseInt(br.readLine());
        String part = "AKAR";
        
        StringBuilder sb = new StringBuilder();
        
        while (k-- > 0) sb.append(part);
        
        sb.append("AKA");
        
        System.out.println(sb);
    }
}