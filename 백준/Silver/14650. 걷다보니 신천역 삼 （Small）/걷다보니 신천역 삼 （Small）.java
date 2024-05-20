import java.io.*;

public class Main {

	static int n, cnt = 0;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		n = Integer.parseInt(br.readLine());

		solve(0, 0);

		System.out.println(cnt);
	}

	static void solve(int num, int size) {
		if (size == n) {
			if (num % 3 == 0) cnt++;
			return;
		}
        
        if (size == 0) {
            solve(1, 1);
            solve(2, 1);
        } else {
            for (int i = 0; i < 3; i++) {
			    solve(num * 10 + i, size + 1);
		    }
        }
	}
}