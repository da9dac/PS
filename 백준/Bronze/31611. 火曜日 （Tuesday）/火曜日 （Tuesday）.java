import java.io.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        System.out.println(Integer.parseInt(br.readLine()) % 7 == 2 ? 1 : 0);
    }
}