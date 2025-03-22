import java.io.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int n = Integer.parseInt(br.readLine());
        String s = br.readLine();
        
        int cnt = 0;
        int cur = 0;
        
        while(cur < n) {
            if (s.charAt(cur) == 'S') {
                cur++;
            } else {
                cur += 2;
            }
            cnt++;
        }
        
        cnt++;
        
        System.out.println(cnt <= n ? cnt : n);
    }
}