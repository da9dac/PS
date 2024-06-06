import java.io.*;
import java.util.*;

class Main {
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(br.readLine());

		Map<String, Integer> map = new HashMap<>();

		while (n-- > 0) {
			String[] arr = br.readLine().split(" ");
			Arrays.sort(arr);

			String str = String.join(",", arr);

			map.put(str, map.getOrDefault(str, 0) + 1);
		}

		int max = 0;

		for (String key : map.keySet()) max = Math.max(max, map.get(key));

		System.out.println(max);
    }
}