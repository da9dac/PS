import java.io.*;
import java.util.*;
class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;
        String str;
        while((str = br.readLine()) != null) {
			st = new StringTokenizer(str);
			int n = Integer.parseInt(st.nextToken());
			int k = Integer.parseInt(st.nextToken());
			int sum = n;
			int stamp = n;
			while (stamp >= k) {
				int cp = stamp / k;
				sum += cp;
				stamp %= k;
				stamp += cp;
			}
			sb.append(sum).append("\n");
		}
        System.out.println(sb);
    }
}