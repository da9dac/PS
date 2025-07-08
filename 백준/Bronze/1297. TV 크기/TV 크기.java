import java.io.*;
import java.util.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		double d = Double.parseDouble(st.nextToken());
		double h = Double.parseDouble(st.nextToken());
		double w = Double.parseDouble(st.nextToken());

		double k = d / Math.sqrt(h * h + w * w);

		System.out.println((int)(h * k) + " " + (int)(w * k));
    }
}