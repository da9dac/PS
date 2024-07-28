import java.io.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        String s = br.readLine();
        String p = br.readLine();
        
        int idx = 0;
        int cnt = 1;
        
        for (int i = 0; i < p.length(); i++) {
            String sub = p.substring(idx, i + 1);
            if (s.contains(sub)) continue;
            cnt++;
            idx = i;
        }
        
        System.out.println(cnt);
    }
}