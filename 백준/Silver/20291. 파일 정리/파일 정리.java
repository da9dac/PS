import java.io.*;
import java.util.*;

class Main {
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        
        int n = Integer.parseInt(br.readLine());
        String[] name;
        
        TreeMap<String, Integer> map = new TreeMap<>();
        
        while (n-- > 0) {
            name = br.readLine().split("\\.");
            map.put(name[1], map.getOrDefault(name[1], 0) + 1);
        }
        
        for (String key : map.keySet()) {
            sb.append(key).append(" ").append(map.get(key)).append("\n");
        }
        
        System.out.println(sb);
    }
}