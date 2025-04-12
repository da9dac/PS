import java.io.*;

class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int t = Integer.parseInt(br.readLine());

		String[] arr = new String[]{
			"",
			"VVV딸기",
			"VV딸기V",
			"VV딸기딸기",
			"V딸기VV",
			"V딸기V딸기",
			"V딸기딸기V",
			"V딸기딸기딸기",
			"딸기VVV",
			"딸기VV딸기",
			"딸기V딸기V",
			"딸기V딸기딸기",
			"딸기딸기VV",
			"딸기딸기V딸기",
			"딸기딸기딸기V",
			"딸기딸기딸기딸기"
		};

		StringBuilder sb = new StringBuilder();

		while (t-- > 0) {
			int n = (Integer.parseInt(br.readLine()) - 1) % 28 + 1;

			sb.append(n <= 15 ? arr[n] : arr[30 - n]).append("\n");
		}

		System.out.println(sb);
	}
}