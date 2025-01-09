import java.io.*;
import java.util.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        int r = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());
        
        int r2 = 2 * r;
		int c2 = 2 * c;

		char[][] card = new char[r2][c2];

		for (int i = 0; i < r; i++) {
			char[] chs = br.readLine().toCharArray();

			for (int j = 0; j < c; j++) {
				card[i][j] = chs[j];
				card[i][c2 - j - 1] = chs[j];
				card[r2 - i - 1][j] = chs[j];
				card[r2 - i - 1][c2 - j - 1] = chs[j];
			}
		}
        
        st = new StringTokenizer(br.readLine());
        
        int a = Integer.parseInt(st.nextToken()) - 1;
        int b = Integer.parseInt(st.nextToken()) - 1;
        
        card[a][b] = card[a][b] == '#' ? '.' : '#';
        
        StringBuilder sb = new StringBuilder();
        
        for (int i = 0; i < r2; i++) {
            for (int j = 0; j < c2; j++) {
                sb.append(card[i][j]);
            }
            sb.append("\n");
        }
        
        System.out.println(sb);
    }
}