import java.io.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        String n = br.readLine();
        
        long sum = 0;
        
        for (int i = 0; i < n.length(); i++) {
            sum += Math.pow(n.charAt(i) - '0', 5);
        }
        
        System.out.println(sum);
    }
}