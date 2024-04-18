import java.io.*;
import java.util.*;

class Main {
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();
        
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        int x = Integer.parseInt(st.nextToken());
        
        int[] isVisited = new int[n + 1];
        Arrays.fill(isVisited, -1);
        
        ArrayList<ArrayList<Integer>> near = new ArrayList<>();
        TreeSet<Integer> result = new TreeSet<>();
        
        for (int i = 0; i <= n; i++) {
            near.add(new ArrayList<>());
        }
        
        while (m-- > 0) {
            st = new StringTokenizer(br.readLine());
            
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            
            near.get(a).add(b);
        }
        
        Queue<Integer> q = new ArrayDeque<>();
        
        q.offer(x);
        isVisited[x] = 0;
        
        while (!q.isEmpty()) {
            int cur = q.poll();
            
            for (int next : near.get(cur)) {
                if (isVisited[next] != -1) continue;
                isVisited[next] = isVisited[cur] + 1;
                if (isVisited[next] == k) {
                    result.add(next);
                    continue;
                }
                q.offer(next);
            }
        }
        
        if (result.isEmpty()) {
            sb.append(-1);
        } else {
            for (int i : result) {
                sb.append(i).append("\n");
            }
        }
        
        System.out.println(sb);
    }
}