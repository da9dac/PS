import java.io.*;

class Main {
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        char[] a = br.readLine().toCharArray();
        char[] b = br.readLine().toCharArray();
        int total = 0;
        
        if (a.length > b.length) {
            char[] tmp = b;
            b = a;
            a = tmp;
        }
        
        int[] ac = new int[26];
        int[] bc = new int[26];
        
        for (int i = 0; i < a.length; i++) {
            ac[a[i] - 'a']++;
        }
        
        for (int i = 0; i < b.length; i++) {
            bc[b[i] - 'a']++;
        }
        
        for (int i = 0; i < 26; i++) {
            bc[i] = Math.abs(bc[i] - ac[i]);
            total += bc[i];
        }
        
        System.out.println(total);
    }
}