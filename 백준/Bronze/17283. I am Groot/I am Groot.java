import java.io.*;

class Main {
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int l = Integer.parseInt(br.readLine());
		int r = Integer.parseInt(br.readLine());

		double sum = 0;
		int len = l;
		double per = (double)r / 100;
		int x = 2;

		while(len > 5) {
			len *= per;
			if (len <= 5) break;
			sum += len * x;
			x *= 2;
		}

		System.out.println((int)sum);
    }
}