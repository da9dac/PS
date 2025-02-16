import java.io.*;
import java.util.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        
        int[] water = new int[n];
        
        for (int i = 0; i < n; i++) {
            water[i] = Integer.parseInt(br.readLine());
        }
        
        long r = Integer.MAX_VALUE;
		long l = 0;
		long a = 0;

		while (l <= r) {
			long cnt = 0;
			long mid = (l + r) / 2;

			if (mid != 0) {
				for (int i = 0; i < n; i++) {
					cnt += water[i] / mid;
				}
			}

			if (cnt < k) {
				r = mid - 1;
			} else {
				l = mid + 1;
				a = mid;
			}
		}

		System.out.println(k == 0 ? 0 : a);
    }
}