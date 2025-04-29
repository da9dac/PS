import java.io.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int t = Integer.parseInt(br.readLine());
        
        StringBuilder sb = new StringBuilder();
        
        while (t-- > 0) {
            int n = Integer.parseInt(br.readLine());
            
            if (n == 0) continue;
            
            String binary = Integer.toBinaryString(n);
            int len = binary.length();
            
            for (int i = 0; i < len; i++) {
                if (binary.charAt(len - 1 - i) == '1') {
                    sb.append(i).append(" ");
                }
            }
            
            sb.append("\n");
        }
        
        System.out.println(sb);
    }
}