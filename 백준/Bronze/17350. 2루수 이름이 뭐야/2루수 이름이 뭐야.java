import java.io.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int n = Integer.parseInt(br.readLine());
        boolean hasAnj = false;
        
        while (n-- > 0) {
            String name = br.readLine();
            
            if (name.equals("anj")) {
                hasAnj = true;
                break;
            }
        }
        
        System.out.println(hasAnj ? "뭐야;" : "뭐야?");
    }
}