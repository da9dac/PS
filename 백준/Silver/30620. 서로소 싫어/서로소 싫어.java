import java.io.*;
import java.util.*;

public class Main {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st = new StringTokenizer(br.readLine());
        
		long x = Long.parseLong(st.nextToken());
		long y = Long.parseLong(st.nextToken());
		
		
		sb.append(2).append("\n");
		
		long a = x * y - x;
        
		sb.append(a).append("\n");
		
		a += x;
		a -= y;
        
		sb.append(-a).append("\n");
		
		System.out.println(sb);
	}
}