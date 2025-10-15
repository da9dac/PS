import java.io.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = "WelcomeToSMUPC";
        
        int n = Integer.parseInt(br.readLine());
        int idx = n % s.length() - 1;
        
        if (idx == -1) idx = s.length() - 1;
        
        System.out.println(s.charAt(idx));
    }
}