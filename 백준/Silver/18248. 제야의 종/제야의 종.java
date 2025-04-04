import java.io.*;
import java.util.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());

		int[][] people = new int[N][M + 1];

		for (int n = 0; n < N; n++) {
			st = new StringTokenizer(br.readLine());
			int sum = 0;
			for (int m = 0; m < M; m++) {
				people[n][m] = Integer.parseInt(st.nextToken());
				sum += people[n][m];

			}
			people[n][M] = sum;
		}

		Arrays.sort(people, (e1, e2) -> {
			return e2[M] - e1[M];
		});

		boolean answer = true;

		loop: 
        for (int m = 0; m < M; m++) {
			int check = people[0][m];
			for (int n = 0; n < N; n++) {
				if(check < people[n][m]) {
					answer = false;
					break loop;
				}
				check = people[n][m];
			}
		}

		if (answer) {
			System.out.println("YES");
		} else {
			System.out.println("NO");
		}
    }
}