import java.io.*;
import java.util.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();
        
        int x = Integer.parseInt(st.nextToken());
        int y = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());     
        int half = m / 2;
        int hp = m;
        
        int[] battle = new int[x];
        int[] heal = new int[y];
        
        int bi = 0;
        int hi = 0;
        
        for (int i = 0; i < x; i++) {
            battle[i] = Integer.parseInt(br.readLine());
        }
        
        for (int i = 0; i < y; i++) {
            heal[i] = Integer.parseInt(br.readLine());
        }
        
        for (int i = 0; i < x + y; i++) {
            if (hp <= half && hi < y) {
                hp += heal[hi++];
                sb.append(hi).append("\n");
                continue;
            }
            
            if (bi >= x) {
                if (hi < y) {
                    hp += heal[hi++];
                    sb.append(hi).append("\n");
                    if (hp > m) hp = m;
                }
                continue;
            }
            
            hp -= battle[bi++];
            sb.append(-bi).append("\n");

         if (hp <= 0) break;
      }

      System.out.println(hp > 0 ? sb : 0);
    }
}