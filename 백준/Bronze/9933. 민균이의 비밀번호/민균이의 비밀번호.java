import java.io.*;
import java.util.*;

class Main {
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int n = Integer.parseInt(br.readLine());
        
        Map<String, String> map = new HashMap<>();
        
        while (n-- > 0) {
            String str = br.readLine();
            int len = str.length();
            char[] chs = new char[len];
            int idx = len - 1;
            
            for (int i = 0; i < len; i++) {
                chs[i] = str.charAt(idx--);
            }
            
            String reverse = new String(chs);
            
            map.put(str, reverse);
        }
        
        for (String key : map.keySet()) {
            String value = map.get(key);
            if (map.get(value) != null) {
                int len = key.length();
                System.out.println(len + " " + key.charAt(len / 2));
                break;
            }
        }
    }
}