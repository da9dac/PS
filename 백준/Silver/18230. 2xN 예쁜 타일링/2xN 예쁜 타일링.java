import java.io.*;
import java.util.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        int n = Integer.parseInt(st.nextToken());
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        
        int[] pa = new int[a];
		int[] pb = new int[b];

		st = new StringTokenizer(br.readLine());

		for (int i = 0; i < a; i++) {
			pa[i] = Integer.parseInt(st.nextToken());
		}

		st = new StringTokenizer(br.readLine());

		for (int i = 0; i < b; i++) {
			pb[i] = Integer.parseInt(st.nextToken());
		}

		Arrays.sort(pa);
		Arrays.sort(pb);
        
        int x = a - 1;
        int y = b - 1;
        int sum = 0;
        
        if (n % 2 != 0) {
            sum += pa[x--];
            n--;
        }
        
        while (n > 0) {
            int tt = x > 0 ? pa[x] + pa[x - 1] : 0;
            int f = y >= 0 ? pb[y] : 0;
            
            if (tt > f) {
                sum += tt;
                x -= 2;
            } else {
                sum += f;
                y--;
            }
            
            n -= 2;
        }
        
        System.out.print(sum);
    }
}