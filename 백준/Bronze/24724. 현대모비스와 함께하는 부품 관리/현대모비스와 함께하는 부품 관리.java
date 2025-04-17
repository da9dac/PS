import java.io.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        String start = "Material Management ";
        String end = "Classification ---- End!";
        
        int cnt = 1;
        int t = Integer.parseInt(br.readLine());
        
        StringBuilder sb = new StringBuilder();
        
        while (t-- > 0) {
            sb.append(start)
                .append(cnt++)
                .append("\n")
                .append(end)
                .append("\n");
            
            int n = Integer.parseInt(br.readLine());
            br.readLine();
            
            while (n-- > 0) br.readLine();
        }
        
        System.out.println(sb);
    }
}