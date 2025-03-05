import java.io.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int t = Integer.parseInt(br.readLine());
        
        StringBuilder sb = new StringBuilder();
        
        while (t-- > 0) {
            String n = br.readLine();
            
            int x = Integer.parseInt(n) + 1;
            int y = Integer.parseInt(n.substring(2));
            
            sb.append(x % y == 0 ? "Good" : "Bye").append("\n");
        }
        
        System.out.println(sb);
    }
}