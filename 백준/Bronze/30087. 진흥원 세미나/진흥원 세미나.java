import java.io.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int n = Integer.parseInt(br.readLine());
        
        StringBuilder sb = new StringBuilder();
        
        while (n-- > 0) {
            String name = br.readLine();
            
            if (name.equals("Algorithm")) sb.append(204);
            else if (name.equals("DataAnalysis")) sb.append(207);
            else if (name.equals("ArtificialIntelligence")) sb.append(302);
            else if (name.equals("CyberSecurity")) sb.append("B101");
            else if (name.equals("Network")) sb.append(303);
            else if (name.equals("Startup")) sb.append(501);
            else {
                sb.append(105);
            }
            
            sb.append("\n");
        }
        
        System.out.println(sb);
    }
}