import java.io.*;
import java.util.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        
        int n = Integer.parseInt(br.readLine());
        int play = n * (n - 1) / 2;
        
        int[] scores = new int[n];
        
        for (int i = 0; i < play; i++) {
            st = new StringTokenizer(br.readLine());
            
            int a = Integer.parseInt(st.nextToken()) - 1;
            int b = Integer.parseInt(st.nextToken()) - 1;
            int c = Integer.parseInt(st.nextToken());
            int d = Integer.parseInt(st.nextToken());
            
            if (c > d) scores[a] += 3;
            else if (c < d) scores[b] += 3;
            else {
                scores[a]++;
                scores[b]++;
            }
        }
        
        int[] teams = Arrays.copyOf(scores, n);

		Arrays.sort(scores);

		int[] ranks = new int[1001];
		int rank = 0;
		int cnt = 1;
		int prev = -1;

		for (int i = n - 1; i >= 0; i--) {
			int score = scores[i];

			if (score != prev) {
				prev = score;
				rank += cnt;
				cnt = 1;
				ranks[score] = rank;
			} else {
				cnt++;
			}
		}
        
        StringBuilder sb = new StringBuilder();
        
        for (int team : teams) {
            sb.append(ranks[team]).append("\n");
        }
        
        System.out.println(sb);
    }
}