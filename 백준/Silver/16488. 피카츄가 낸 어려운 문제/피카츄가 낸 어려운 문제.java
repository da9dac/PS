import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(" ");

        long N = Long.parseLong(input[0]);
        long K = Long.parseLong(input[1]);

        System.out.println(N * N * K);
    }
}