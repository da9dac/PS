import java.io.*;
import java.util.*;

class Main {
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        
        Country[] arr = new Country[n];
        
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            
            int t = Integer.parseInt(st.nextToken());         
            int g = Integer.parseInt(st.nextToken());
            int s = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            
            arr[i] = new Country(t, g, s, b);
        }
        
        Arrays.sort(arr, (a, b) -> {
            return b.g != a.g ? b.g - a.g : b.s != a.s ? b.s - a.s : b.b - a.b;
        });
        
        for (int i = 0; i < n; i++) {
            if (arr[i].t == k) {
                System.out.println(i + 1);
                return;
            }
        }
    }
    
    static class Country {
        int t, g, s, b;
        
        public Country(int t, int g, int s, int b) {
            this.t = t;
            this.g = g;
            this.s = s;
            this.b = b;
        }
    }
}