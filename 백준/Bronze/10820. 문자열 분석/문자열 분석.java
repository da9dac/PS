import java.io.*;

class Main {
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        StringBuilder sb = new StringBuilder();
        String str;
        
        while((str = br.readLine()) != null) {
            int s = 0;
            int d = 0;
            int n = 0;
            int k = 0;
            
            for (char c : str.toCharArray()) {
                if (c == ' ') k++;
                else if (Character.isDigit(c)) n++;
                else if (c >= 'a') s++;
                else d++;
            }
            
            sb.append(s).append(" ").append(d).append(" ")
                .append(n).append(" ").append(k).append("\n");
        }
        
        System.out.println(sb);
    }
}