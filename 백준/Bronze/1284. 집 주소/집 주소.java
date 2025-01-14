import java.io.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        
        String input;
        
        while (!(input = br.readLine()).equals("0")) {
            int sum = 1;
            int len = input.length();
            
            for (int i = 0; i < len; i++) {
                int x = input.charAt(i) - '0';
                
                if (x == 0) sum += 5;
                else if (x == 1) sum += 3;
                else sum += 4;
            }
            
            sb.append(sum).append("\n");
        }
        
        System.out.println(sb);
    }
}