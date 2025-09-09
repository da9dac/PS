import java.io.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        long x = Integer.parseInt(br.readLine()) * Integer.parseInt(br.readLine()) * Integer.parseInt(br.readLine());
        
        int[] count = new int[10];
        
        String s = String.valueOf(x);
        
        for (int i = 0; i < s.length(); i++) {
            count[s.charAt(i) - '0']++;
        }
        
        StringBuilder sb = new StringBuilder();
        
        for (int i = 0; i < 10; i++) sb.append(count[i]).append("\n");
        
        System.out.println(sb);
    }
}