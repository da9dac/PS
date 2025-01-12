import java.io.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        
        int t = Integer.parseInt(br.readLine());
        
        while (t-- > 0) {
            double price = Double.parseDouble(br.readLine());
            price = Math.round((price * 0.8) * 100) / 100.0;
            
            sb.append("$").append(String.format("%.2f", price)).append("\n");
        }
        
        System.out.println(sb);
    }
}