import java.io.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int n = Integer.parseInt(br.readLine());
        String s = br.readLine();
        
        int cnt = 1;
        int cur = 0;
        
        while(cur < n) {
            cur += s.charAt(cur) == 'S' ? 1 : 2;
            cnt++;
        }
        
        System.out.println(cnt <= n ? cnt : n);
    }
}