import java.io.*;

class Main {
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int mod = 1000000000;

		int n = Integer.parseInt(br.readLine());

		if (n == 0) {
			sb.append(0).append("\n").append(0);
		} else if (n < 0) {
			n *= -1;

			long[] f = new long[n + 1];

			f[1] = 1;

			for (int i = 2; i <= n; i++) {
				f[i] = (f[i - 2] + (-1 * f[i - 1])) % mod;
			}
            
            f[n] %= mod;

			sb.append(f[n] < 0 ? -1 : 1).append("\n").append(Math.abs(f[n]));
		} else {
			long[] f = new long[n + 1];

			f[1] = 1;

			for (int i = 2; i <= n; i++) {
				f[i] = (f[i - 2] + f[i - 1]) % mod;
			}
            
            f[n] %= mod;

			sb.append(1).append("\n").append(f[n]);
		}

		System.out.println(sb);
    }
}