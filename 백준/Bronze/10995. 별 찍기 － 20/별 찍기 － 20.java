import java.io.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int n = Integer.parseInt(br.readLine());
        int m = n * 2;
        
        StringBuilder sb = new StringBuilder();
        
        for (int i = 0; i < n; i++) {
            if (i % 2 == 0) {
                for (int j = 0; j < m - 1; j++) {
                    sb.append(j % 2 == 0 ? "*" : " ");
                }
            } else {
                for (int j = 0; j < m; j++) {
                    sb.append(j % 2 != 0 ? "*" : " ");
                }
            }
            sb.append("\n");
        }
        
        System.out.println(sb);
    }
}