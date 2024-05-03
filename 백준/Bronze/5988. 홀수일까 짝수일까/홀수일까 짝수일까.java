import java.io.*;

class Main {
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        
        int n = Integer.parseInt(br.readLine());
        
        String s;
        
        while (n-- > 0) {
            s = br.readLine();
            
            int k = (int) (s.charAt(s.length() - 1) - '0');
            
            sb.append(k % 2 == 0 ? "even" : "odd").append("\n");
        }
        
        System.out.println(sb);
    }
}