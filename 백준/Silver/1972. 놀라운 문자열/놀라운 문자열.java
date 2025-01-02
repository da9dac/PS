import java.io.*;
import java.util.*;

class Main {
    static final String BREAK = "*";
    static final String YES = " is surprising.\n";
    static final String NO = " is NOT surprising.\n";
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        
        String str;
        Set<String> set = new HashSet<>();
        
        while (!(str = br.readLine()).equals(BREAK)) {
            int len = str.length();
            int end = len - 1;
            
            boolean isSurprising = true;
            
            for (int i = 1; i <= end; i++) {
                set.clear();
                int cnt = 0;
                
                for (int j = 0; j < len - i; j++) {
                    char x = str.charAt(j);
                    char y = str.charAt(j + i);
                    
                    cnt++;
                    
                    set.add(new String(new char[]{x, y}));
                }
                
                int size = set.size();
                
                if (cnt != size) {
                    isSurprising = false;
                    break;
                }
            }
            
            sb.append(str).append(isSurprising ? YES : NO);
        }
        
        System.out.println(sb);
    }
}