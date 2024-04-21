import java.io.*;
import java.util.*;

class Main {
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        int[] map = new int[101];
        int[] isVisited = new int[101];
        Arrays.fill(isVisited, -1);
        
        int nm = Integer.parseInt(st.nextToken()) + Integer.parseInt(st.nextToken());
        
        while (nm-- > 0) {
            st = new StringTokenizer(br.readLine());
            
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());
            
            map[x] = y;
        }
        
        Queue<Integer> q = new ArrayDeque<>();
        q.offer(1);
        isVisited[1] = 0;
        
        while (!q.isEmpty()) {
            int cur = q.poll();
            int move = isVisited[cur] + 1;
            
            for (int dice = 1; dice <= 6; dice++) {
                int next = cur + dice;

				if (next > 100) continue;

				if (map[next] != 0) {
					int x = map[next];

					if (isVisited[x] != -1 && isVisited[x] <= move) continue;

					isVisited[x] = move;
					q.offer(x);

					continue;
				}

				if (next == 100) {
					System.out.println(move);
					return;
				}

				if (isVisited[next] != -1 && isVisited[next] <= move) continue;

				isVisited[next] = move;
				q.offer(next);
            }
        }
    }
}