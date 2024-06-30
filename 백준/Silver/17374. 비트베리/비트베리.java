import java.io.*;
import java.util.*;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		StringBuilder sb = new StringBuilder();

		int t = Integer.parseInt(br.readLine());
		
		while(t-->0){
			st =new StringTokenizer(br.readLine());
			int P = Integer.parseInt(st.nextToken());
			int Q = Integer.parseInt(st.nextToken());
			int A = Integer.parseInt(st.nextToken());
			int B = Integer.parseInt(st.nextToken());
			int C = Integer.parseInt(st.nextToken());
			int D = Integer.parseInt(st.nextToken());
			int coin = (Q/C)*D;
			P += (coin/B)*A;
			coin = coin % B;
			int x = (P-coin)/(A+B);
			int ans = Math.max(Math.min(coin+(B*x), P-(A*x)), Math.min(coin+(B*(x+1)), P-(A*(x+1))));
			sb.append(ans).append("\n");
		}

		System.out.println(sb);
	}
}