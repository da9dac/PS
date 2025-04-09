import java.io.*;
import java.util.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int n = Integer.parseInt(br.readLine());
        
        StringBuilder sba = new StringBuilder();
        StringBuilder sbb = new StringBuilder();
        
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        for (int i = 0; i < n; i++) sba.append(st.nextToken());
        
        st = new StringTokenizer(br.readLine());
        
        for (int i = 0; i < n; i++) sbb.append(st.nextToken());
        
        long x = Long.parseLong(sba.toString());
        long y = Long.parseLong(sbb.toString());
        
        System.out.println(x >= y ? y : x);
    }
}