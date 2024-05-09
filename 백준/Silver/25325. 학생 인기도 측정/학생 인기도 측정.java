import java.io.*;
import java.util.*;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(br.readLine());

		Map<String, Integer> map = new HashMap<>();
		StringTokenizer st = new StringTokenizer(br.readLine());

		for (int i = 0; i < n; i++) {
			map.put(st.nextToken(), 0);
		}

		for (int i = 0; i < n; i++) {
			st = new StringTokenizer(br.readLine());

			while (st.hasMoreTokens()) {
				String key = st.nextToken();
				map.put(key, map.get(key) + 1);
			}
		}

		PriorityQueue<Student> pq = new PriorityQueue<>(
			(a, b) -> b.votes != a.votes ? b.votes - a.votes : a.name.compareTo(b.name)
		);

		for (String key : map.keySet()) {
			pq.offer(new Student(key, map.get(key)));
		}

		StringBuilder sb = new StringBuilder();

		while (!pq.isEmpty()) {
			Student student = pq.poll();

			sb.append(student.name).append(" ").append(student.votes).append("\n");
		}

		System.out.println(sb);
	}

	static class Student {
		String name;
		int votes;

		public Student(String name, int votes) {
			this.name = name;
			this.votes = votes;
		}
	}
}