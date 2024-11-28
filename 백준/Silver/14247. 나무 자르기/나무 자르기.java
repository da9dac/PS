import java.io.*;
import java.util.*;

class Main {
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int n = Integer.parseInt(br.readLine());
        
        Tree[] trees = new Tree[n];
        
        StringTokenizer heights = new StringTokenizer(br.readLine());
        StringTokenizer as = new StringTokenizer(br.readLine());
       
        
        for (int i = 0; i < n; i++) {
            int h = Integer.parseInt(heights.nextToken());
            int a = Integer.parseInt(as.nextToken());
            
            trees[i] = new Tree(h, a);
        }
        
        Arrays.sort(trees, (x, y) -> {
           return x.a - y.a; 
        });
        
        long max = 0;
        int day = 0;
        
        for (Tree tree : trees) {
            max += tree.h + tree.a * day++;
        }
        
        System.out.println(max);
    }
    
    static class Tree {
        int h;
        int a;
        
        Tree(int h, int a) {
            this.h = h;
            this.a = a;
        }
    }
}