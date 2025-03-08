import java.io.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        boolean[] arr = new boolean[26];
        
        arr['a' - 'a'] = true;
        arr['b' - 'a'] = true;
        arr['c' - 'a'] = true;
        arr['d' - 'a'] = true;
        arr['e' - 'a'] = true;
        arr['g' - 'a'] = true;
        arr['i' - 'a'] = true;
        arr['m' - 'a'] = true;
        arr['r' - 'a'] = true;
        
        char[] chs = br.readLine().toCharArray();
        
        StringBuilder sb = new StringBuilder();
        
        for (char ch : chs) {
            if (!arr[ch - 'A']) sb.append(ch);
        }
        
        System.out.println(sb);
    }
}