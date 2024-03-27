import java.io.*;
import java.util.*;

class Main {
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		Queue<Pair> q;
		PriorityQueue<Integer> pq;
		StringBuilder sb = new StringBuilder();

		int t = Integer.parseInt(br.readLine());

		while (t-- > 0) {
			st = new StringTokenizer(br.readLine());

			int n = Integer.parseInt(st.nextToken());
			int m = Integer.parseInt(st.nextToken());

			st = new StringTokenizer(br.readLine());

			q = new ArrayDeque<>();
			pq = new PriorityQueue<>((x1, x2) -> x2 - x1);

			for (int i = 0; i < n; i++) {
				int x = Integer.parseInt(st.nextToken());

				q.offer(new Pair(x, i == m));
				pq.offer(x);
			}

			int cnt = 0;

			while(!q.isEmpty()) {
				int max = pq.peek();
				Pair cur = q.poll();

				if (cur.num < max) {
					q.offer(cur);
					continue;
				}

				cnt++;

				if (cur.isTarget) break;
				pq.poll();
			}

			sb.append(cnt).append("\n");
		}

		System.out.println(sb);
    }
    
    static class Pair {
        int num;
        boolean isTarget;
        
        public Pair(int num, boolean isTarget) {
            this.num = num;
            this.isTarget = isTarget;
        }
    }
}