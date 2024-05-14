import java.io.*;
import java.util.*;

class Main {
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;
        String input;
        
        while (!(input = br.readLine()).equals("0 0")) {
            st = new StringTokenizer(input);
            
            int n = Integer.parseInt(st.nextToken());
            int m = Integer.parseInt(st.nextToken());
            int nm = n + m;
            
            Set<Integer> set = new HashSet<>();
            
            for (int i = 0; i < nm; i++) set.add(Integer.parseInt(br.readLine()));
            
            sb.append(nm - set.size()).append("\n");
        }
        
        System.out.println(sb);
    }
}