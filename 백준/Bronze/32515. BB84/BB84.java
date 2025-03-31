import java.io.*;
import java.util.*;

class Main {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
        
		int n = Integer.parseInt(br.readLine());
		
		char[] js = br.readLine().toCharArray();
		char[] jk = br.readLine().toCharArray();
		char[] is = br.readLine().toCharArray();
		char[] ik = br.readLine().toCharArray();
		
		boolean check = true;
        
		for (int i = 0; i < n; i++) {
			if (js[i] == is[i]) {
				if (jk[i] != ik[i]) {
					check = false;
					break;
				} else { 
					sb.append(ik[i]);
				}
			}
		}
		
		if (!check) {
			sb = new StringBuilder();
			sb.append("htg!");
		}
		
		bw.write(sb.toString());
		bw.flush();
		bw.close();
		br.close();
	}
}