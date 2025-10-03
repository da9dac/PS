import java.io.*;
import java.util.*;

public class Main {
    static class Batting {
        int a, b;

        Batting(int a, int b) {
            this.a = a;
            this.b = b;
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        
        String[] line = br.readLine().split(" ");
        int n = Integer.parseInt(line[0]);
        int m = Integer.parseInt(line[1]);

        Batting[] v = new Batting[n];
        for (int i = 0; i < n; i++) {
            line = br.readLine().split(" ");
            int a = Integer.parseInt(line[0]);
            int b = Integer.parseInt(line[1]);
            v[i] = new Batting(a, b);
        }

        while (m-- > 0) {
            line = br.readLine().split(" ");
            int g = Integer.parseInt(line[0]);
            int a = Integer.parseInt(line[1]);
            int b = Integer.parseInt(line[2]);

            int cnt = 0;
            for (int i = 0; i < n; i++) {
                if (v[i].a >= a && v[i].b >= b && v[i].a + v[i].b <= g) {
                    cnt++;
                }
            }
            sb.append(cnt).append('\n');
        }

        System.out.print(sb);
    }
}
