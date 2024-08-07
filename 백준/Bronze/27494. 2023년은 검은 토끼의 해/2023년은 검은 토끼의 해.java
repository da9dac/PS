import java.io.*;

class Main {
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int n = Integer.parseInt(br.readLine());
        char[] arr = {'2', '0', '2', '3'};
        
        if (n < 2023) {
            System.out.println(0);
            return;
        }
        
        int cnt = 1;
        
        for (int num = 12023; num <= n; num++) {
            char[] chs = String.valueOf(num).toCharArray();
            int len = chs.length;
            int x = 0;
            
            for (int i = 0; i < len; i++) {
                if (chs[i] == arr[x]) {
                    x++;
                    if (x == 4) {
                        cnt++;
                        break;
                    }
                }
            }
        }
        
        System.out.println(cnt);
    }
}