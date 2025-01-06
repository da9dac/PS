import java.io.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        
        int n = Integer.parseInt(br.readLine());
        
        while (n-- > 0) {
            char[] chs = br.readLine().toCharArray();
            chs[0] = Character.toUpperCase(chs[0]);
            
            sb.append(new String(chs)).append("\n");
        }
        
        System.out.println(sb);
    }
}