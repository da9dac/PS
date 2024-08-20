import java.io.*;
import java.util.*;

class Main {
    static int n, m, k;
    static int[] price;
    static int[] parents;
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        k = Integer.parseInt(st.nextToken());
        int money = k;
        
        price = new int[n];
        parents = new int[n];
        
        st = new StringTokenizer(br.readLine());
        
        for (int i = 0; i < n; i++) {
            price[i] = Integer.parseInt(st.nextToken());
            parents[i] = i;
        }
        
        while (m-- > 0) {
            st = new StringTokenizer(br.readLine());
            
            int v = Integer.parseInt(st.nextToken()) - 1;
            int w = Integer.parseInt(st.nextToken()) - 1;
            
            union(v, w);
        }
        
        for (int i = 0; i < n; i++) {
            money -= price[i];
        }
        
        System.out.println(money < 0 ? "Oh no" : k - money);
    }
    
    static void union(int v, int w) {
        int x = find(v);
        int y = find(w);
        
        if (x == y) return;
        
        if (x < y) {
         price[x] = Math.min(price[x], price[y]);
         price[y] = 0;
         parents[y] = x;
      } else {
         price[y] = Math.min(price[x], price[y]);
         price[x] = 0;
         parents[x] = y;
      }
    }
    
    static int find(int cur) {
        return parents[cur] == cur ? cur : find(parents[cur]);
    }
}