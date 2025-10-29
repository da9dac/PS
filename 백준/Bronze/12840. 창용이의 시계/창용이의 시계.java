import java.io.*;
import java.util.*;

class Main {
    static final int DAY = 86400;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int h = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int s = Integer.parseInt(st.nextToken());
        int q = Integer.parseInt(br.readLine());

        int cur = 3600 * h + 60 * m + s;
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < q; i++) {
            st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            if (x == 3) {
                sb.append(cur / 3600).append(' ')
                  .append((cur / 60) % 60).append(' ')
                  .append(cur % 60).append('\n');
            } else if (x == 1) {
                int y = Integer.parseInt(st.nextToken());
                cur = (cur + y) % DAY;
            } else {
                int y = Integer.parseInt(st.nextToken());
                cur = (cur - y) % DAY;
                if (cur < 0) cur += DAY;
            }
        }

        System.out.print(sb.length() > 0 ? sb : "");
    }
}
