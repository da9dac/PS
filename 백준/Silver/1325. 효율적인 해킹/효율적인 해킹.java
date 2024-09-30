import java.io.*;
import java.util.*;

public class Main {
	static int N, M;
	static ArrayList <Integer>[] arr;
	static boolean isVisited[];
	static int max;
	static int cntArr[];
	
	static void BFS(int start) {
		Queue <Integer> que = new ArrayDeque<Integer>();
		
		que.add(start);
		isVisited[start] = true;
		
		while(!que.isEmpty()) {
			int now = que.poll();
			for (int i : arr[now]) {
				if (isVisited[i]) continue;
				cntArr[i]++; // i가 해킹할 수 있는 숫자 증가
				isVisited[i] = true;
				que.add(i);
			}
		}
	}
	

	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(bf.readLine());
		
		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());
		
		isVisited = new boolean[N+1];
		cntArr = new int[N+1];
		
		// 신뢰 관계 입력
		arr = new ArrayList[N+1];
		for (int i=0; i<N+1; i++) arr[i] = new ArrayList <Integer>();
		for (int i=0; i<M; i++) {
			st = new StringTokenizer(bf.readLine());
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			arr[a].add(b); // a가 b를 신뢰, a는 b에게 해킹 당할 수 있음
		}
		
		for (int i=1; i<N+1; i++) {
			isVisited = new boolean[N+1];
			BFS(i); // 메모리↑ 시간↓
			
		}
		
		for (int i=1; i<N+1; i++) {
			if (max<cntArr[i]) max = cntArr[i];
		}
		
		for (int i=1; i<N+1; i++) if (max == cntArr[i]) System.out.print(i+" ");
	}

}