import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int T = Integer.parseInt(br.readLine());

        for (int t = 0; t < T; t++) {
            String encodedMessage = br.readLine();
            String[] words = encodedMessage.split(" ");

            for (String word : words) {
                int sum = 0;

                for (char c : word.toCharArray()) {
                    sum += (c - 'a'); 
                }

                int remainder = sum % 27;

                if (remainder == 26) {
                    sb.append(" ");
                } else {
                    sb.append((char) ('a' + remainder));
                }
            }
            sb.append("\n"); 
        }

        System.out.print(sb.toString());
    }
}
