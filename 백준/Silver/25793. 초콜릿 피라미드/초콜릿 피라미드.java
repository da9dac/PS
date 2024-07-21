import java.io.*;

class Main {
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    int T, R, C;
    String[] strs;

    public void solve() throws IOException {
        T = Integer.parseInt(br.readLine());
        for (int t = 0; t < T; ++t) {
            strs = br.readLine().split(" ");
            int tmpR = Integer.parseInt(strs[0]);
            int tmpC = Integer.parseInt(strs[1]);

            R = Math.min(tmpR, tmpC);
            C = Math.max(tmpR, tmpC);

            long[] ans = pyramid(R, C);


            bw.write(String.valueOf(ans[0]));
            bw.write(String.valueOf(" "));
            bw.write(String.valueOf(ans[1]));
            bw.newLine();

        }

        bw.close();
    }

    long[] pyramid(int r, int c) throws IOException {
        long white = 0, dark = 0;
        long n = r;
        long d = c - r;

        white = 2 * sum2_1_N(n) - (2 * sum_1_N(n)) + n;
        white += d * (r + 2 * sum_1_N(r - 1));

        dark = 2 * (sum2_1_N(n) - sum_1_N(n));
        dark += d * (r + 2 * sum_1_N(r - 1));

        return new long[]{white, dark};
    }

    long sum_1_N(long n) {
        return (1 + n) * n / 2;
    }

    long sum2_1_N(long n) {
        return n * (n + 1) * (2 * n + 1) / 6;
    }

    public static void main(String[] args) throws IOException {
        Main main = new Main();
        main.solve();
    }
}