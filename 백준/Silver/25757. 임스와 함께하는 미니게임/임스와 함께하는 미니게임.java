import java.io.*;
import java.util.*;

class Main {
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        int n = Integer.parseInt(st.nextToken());
        String game = st.nextToken();
        
        int x = game.equals("Y") ? 1 : game.equals("F") ? 2 : 3;
        
        Set<String> set = new HashSet<>();
        
        while (n-- > 0) set.add(br.readLine());
        
        System.out.println(set.size()/x);
    }
}