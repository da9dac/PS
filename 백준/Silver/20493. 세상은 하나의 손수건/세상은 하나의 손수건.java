import java.io.*;
import java.util.*;

class Main {
	static int x = 0;
	static int y = 0;
	static int d = 0;
	static int cur = 0;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		int n = Integer.parseInt(st.nextToken());
		int t = Integer.parseInt(st.nextToken());

		while (n-- > 0){
			st = new StringTokenizer(br.readLine());

			int time = Integer.parseInt(st.nextToken());
			String direction = st.nextToken();

			move(time);

			d += direction.equals("right") ? 1 : -1;

			if (d == -1) d = 3;
			else if (d == 4) d = 0;
		}

		move(t);

		System.out.println(x + " " + y);
	}

	static void move(int next) {
		int move = next - cur;
		cur = next;
		
		switch (d) {
			case 0: {
				x += move;
				break;
			}
			case 1: {
				y -= move;
				break;
			}
			case 2: {
				x -= move;
				break;
			}
			case 3: {
				y += move;
			}
		}
	}
}