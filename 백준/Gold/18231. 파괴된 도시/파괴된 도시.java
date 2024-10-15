import java.io.*;
import java.util.*;

class Main {
	static int n;
	static List<Integer>[] near;
	static boolean[] isBoomed, isChecked;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		StringBuilder sb = new StringBuilder();

		n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());

		near = new List[n + 1];
		isBoomed = new boolean[n + 1];
		isChecked = new boolean[n + 1];

		for (int i = 1; i <= n; i++) {
			near[i] = new ArrayList<>();
		}

		while (m-- > 0) {
			st = new StringTokenizer(br.readLine());

			int u = Integer.parseInt(st.nextToken());
			int v = Integer.parseInt(st.nextToken());

			near[u].add(v);
			near[v].add(u);
		}

		int k = Integer.parseInt(br.readLine());
		st = new StringTokenizer(br.readLine());

		for (int i = 0; i < k; i++) {
			int p = Integer.parseInt(st.nextToken());

			isBoomed[p] = true;
		}

		List<Integer> booms = new ArrayList<>();

		for (int i = 1; i <= n; i++) {
			if (isBoomed[i]) {
				boolean isBoom = true;

				for (int next : near[i]) {
					if (isBoomed[next]) continue;

					isBoom = false;
					break;
				}

				if (isBoom) {
					isChecked[i] = true;
					booms.add(i);
				}
			}
		}

		int cnt = booms.size();

		for (int boom : booms) {
			for (int next : near[boom]) {
				if (isChecked[next] || !isBoomed[next]) continue;

				isChecked[next] = true;
				cnt++;
			}
		}

		if (booms.isEmpty() || cnt != k) {
			sb.append(-1);
		} else {
			sb.append(booms.size()).append("\n");

			for (int boom : booms) {
				sb.append(boom).append(" ");
			}
		}

		System.out.println(sb);
	}
}