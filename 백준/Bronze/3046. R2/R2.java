import java.io.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        String[] input = br.readLine().split(" ");
        
        int r1 = Integer.parseInt(input[0]);
        int s = Integer.parseInt(input[1]);
        
        int r2 = (s * 2) - r1;
        
        System.out.println(r2);
    }
}