import java.io.*;
import java.util.*;

public class Main {

	static int[] parents;
	static Point[] points;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;

		int t = Integer.parseInt(br.readLine());

		while (t-- > 0) {
			int n = Integer.parseInt(br.readLine());

			parents = new int[n + 2];
			points = new Point[n + 2];

			for (int i = 0; i < n + 2; i++) {
				st = new StringTokenizer(br.readLine());

				parents[i] = i;

				int x = Integer.parseInt(st.nextToken());
				int y = Integer.parseInt(st.nextToken());

				points[i] = new Point(x, y);

				for (int j = 0; j < i; j++) {
					if (isPossible(x, y, points[j].x, points[j].y)) {
						union(j, i);
					}
				}
			}

			sb.append(parents[0] == parents[n + 1] ? "happy" : "sad").append("\n");
		}

		System.out.println(sb);
	}

	static void union(int a, int b) {
		a = find(a);
		b = find(b);

		if (a < b) {
			parents[b] = a;
		} else {
			parents[a] = b;
		}
	}

	static int find(int a) {
		if (parents[a] != a) parents[a] = find(parents[a]);

		return parents[a];
	}

	static class Point {
		int x, y;

		public Point(int x, int y) {
			this.x = x;
			this.y = y;
		}
	}

	static boolean isPossible(int cx, int cy, int px, int py) {
		int dist = Math.abs(cx - px) + Math.abs(cy - py);

		return dist <= 1000;
	}
}
