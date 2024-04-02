import java.io.*;
import java.util.*;

class Main {
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        
        int total = 0;
        TreeMap<String, Integer> trees = new TreeMap<>();
        
        String tree;
        
        while((tree = br.readLine()) != null){
            trees.put(tree, trees.getOrDefault(tree, 0) + 1);
            total++;
        }
        
        for (String key : trees.keySet()) {
            int cnt = trees.get(key);
            
            double per = ((double) cnt / total) * 100;

			sb.append(key).append(" ").append(String.format("%.4f", per)).append("\n");
        }
        
        System.out.println(sb);
    }
}