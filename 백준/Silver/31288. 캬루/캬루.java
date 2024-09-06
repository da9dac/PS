import java.io.*;
import java.util.*;


public class Main {
	
	public static String solution(int n, String num) {
		StringBuilder sb = new StringBuilder();
		if(n==1) return "4 2"; 
		int remainder = 0;
		for(char c : num.toCharArray()) {
			int x = c - '0';
			remainder = (x+remainder)%3;
		}
		//각 자리수 탐색
		for(int i=0;i<n;i++) {
			//현재 수 - 나머지, 양수가 아닌 경우 +3을 더해 보정
			int x = num.charAt(i)- '0';
			int next= (x-remainder)<=0 ? (x-remainder+3) : (x-remainder);
			String front = num.substring(0, i);
			String back = num.length()-1>i ?  num.substring(i+1) : "";
			String answer = front+next+back;
			sb.append(answer +" "+" 3\n");//3으로 나뉘어 지는 값 출력
		}
		return sb.toString().trim();
	}
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;
		for(int i=0;i<n;i++) {
			st = new StringTokenizer(br.readLine());
			int m = Integer.parseInt(st.nextToken());
			String num  = st.nextToken();
			sb.append(solution(m, num)+"\n");
		}
		System.out.println(sb.toString());
		br.close();
	}
}