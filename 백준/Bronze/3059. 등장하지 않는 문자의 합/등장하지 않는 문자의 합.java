import java.io.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int t = Integer.parseInt(br.readLine());
        
        StringBuilder sb = new StringBuilder();
        
        while (t-- > 0) {
            boolean[] arr = new boolean[26];
            
            char[] chs = br.readLine().toCharArray();
            
            for (char ch : chs) arr[ch - 'A'] = true;
            
            int sum = 0;
            
            for (int i = 0; i < 26; i++) {
                if (!arr[i]) sum += i + 'A';
            }
            
            sb.append(sum).append("\n");
        }
        
        System.out.println(sb);
    }
}