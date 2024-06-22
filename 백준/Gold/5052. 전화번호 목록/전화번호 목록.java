import java.io.*;
import java.util.*;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();

		int t = Integer.parseInt(br.readLine());

		while (t-- > 0) {
			int n = Integer.parseInt(br.readLine());

			Trie trie = new Trie();
			boolean isConsistent = true;

			String[] arr = new String[n];

			for (int i = 0; i < n; i++) {
				arr[i] = br.readLine();
				trie.insert(arr[i]);
			}

			for (String a : arr) {
				if (trie.contains(a)) {
					isConsistent = false;
					break;
				}
			}

			sb.append(isConsistent ? "YES" : "NO").append("\n");
		}

		System.out.println(sb);
	}

	static class Trie {
		Map<Character, Trie> children = new HashMap<>();
		boolean isLeaf;

		public Trie() {}

		public void insert(String word) {
			Trie trie = this;

			for (int i = 0; i < word.length(); i++) {
				char c = word.charAt(i);

				trie.children.putIfAbsent(c, new Trie());
				trie = trie.children.get(c);

				if (i == word.length() - 1) trie.isLeaf = true;
			}
		}

		public boolean contains(String word) {
			Trie trie = this;

			for (int i = 0; i < word.length(); i++) {
				char c = word.charAt(i);

				Trie child = trie.children.get(c);

				if (child == null) return false;

				trie = child;
			}

			return !trie.isLeaf || !trie.children.isEmpty();
		}
	}
}