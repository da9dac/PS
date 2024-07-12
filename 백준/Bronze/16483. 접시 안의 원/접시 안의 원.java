import java.io.*;

class Main {
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        double t = Double.parseDouble(br.readLine());
        System.out.println(Math.round((t * t) / 4));
    }
}