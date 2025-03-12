import java.io.*;
import java.util.*;

class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;

		int n = Integer.parseInt(br.readLine());
		Point[] points = new Point[n];

		for (int i = 0; i < n; i++) {
			st = new StringTokenizer(br.readLine());
			int x = Integer.parseInt(st.nextToken());
			int y = Integer.parseInt(st.nextToken());
			points[i] = new Point(x, y);
		}

		int totalDistance = 0;
		int[] dist = new int[n - 1];

		for (int i = 0; i < n - 1; i++) {
			dist[i] = getDistance(points[i], points[i + 1]);
			totalDistance += dist[i];
		}

		int minDist = Integer.MAX_VALUE;

		for (int i = 1; i < n - 1; i++) {
			int skippedDist = dist[i - 1] + dist[i];
			int newDist = getDistance(points[i - 1], points[i + 1]);
			minDist = Math.min(minDist, totalDistance - skippedDist + newDist);
		}

		System.out.println(minDist);
	}

	static int getDistance(Point a, Point b) {
		return Math.abs(a.x - b.x) + Math.abs(a.y - b.y);
	}

	static class Point {
		int x, y;
		Point(int x, int y) {
			this.x = x;
			this.y = y;
		}
	}
}
