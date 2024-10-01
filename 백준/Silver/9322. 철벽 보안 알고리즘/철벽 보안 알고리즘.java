import java.io.*;
import java.util.*;

public class Main {
	static int T;
	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(in.readLine());
		T = Integer.valueOf(st.nextToken());
		for(int tc=1; tc<=T; tc++) {
			st = new StringTokenizer(in.readLine());
			int N = Integer.valueOf(st.nextToken());
			HashMap<String, Integer> map = new HashMap<>();
			int nomal[] = new int[N];
			st = new StringTokenizer(in.readLine());
			for(int i=0; i<N; i++) {
				String key = st.nextToken();
				map.put(key, i);
			}
			st = new StringTokenizer(in.readLine());
			for(int i=0; i<N; i++) {
				String key = st.nextToken();
				nomal[i]=map.get(key);
			}
			st = new StringTokenizer(in.readLine());
			String res[] = new String[N];
			for(int i=0; i<N; i++) {
				res[nomal[i]] = st.nextToken();
			}
			for(int i=0; i<N; i++) {
				System.out.print(res[i]+" ");
			}
			System.out.println();
		}
	}
}
