import java.io.*;
import java.util.*;

class Main {
    static int N, M,S,E;
    static boolean visited[];
    static List<ArrayList<Integer>> edge = new ArrayList<>();
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));


    public static void main(String args[])throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());

        S = Integer.parseInt(st.nextToken());
        E = Integer.parseInt(st.nextToken());


        visited = new boolean[N+1];

        for(int i = 0 ;i<=N;i++){
            edge.add(new ArrayList<Integer>());
        }

        for(int i = 0 ;i<M;i++){
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            edge.get(a).add(b);
            edge.get(b).add(a);
        }

        for(int i = 1 ;i<=N;i++){
            if(i-1 > 0){
                edge.get(i).add(i-1);
            }
            if(i+1 <= N){
                edge.get(i).add(i+1);
            }
        }

        visited[S] = true;
        ArrayList<Integer> ed = new ArrayList<Integer>();
        ed.add(S);
        bfs(0,ed);

    }

    public static void bfs(int depth, ArrayList<Integer> ed) throws IOException {
        ArrayList<Integer> edd = new ArrayList<Integer>();

        while(!ed.isEmpty()){
            Integer i = ed.get(0);

            int size = edge.get(i).size();

            for(int j = 0 ;j<size;j++) {
                Integer k = edge.get(i).get(j);

                if(k == E){
                    bw.write(String.valueOf(depth+1));
                    bw.flush();
                    System.exit(0);
                }

                if (!visited[k]) {
                    visited[k] = true;
                    edd.add(k);
                }

            }
            ed.remove(0);
        }
        bfs(depth+1, edd);
    }
}