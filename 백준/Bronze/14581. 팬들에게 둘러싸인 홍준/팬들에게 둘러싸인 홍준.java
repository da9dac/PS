import java.io.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        
        for (int i = 0; i < 3; i++) {
            sb.append(":fan:");
        }
        
        sb.append("\n");
        
        sb.append(":fan::").append(br.readLine()).append("::fan:").append("\n");
        
        for (int i = 0; i < 3; i++) {
            sb.append(":fan:");
        }
        
        System.out.println(sb);
    }
}