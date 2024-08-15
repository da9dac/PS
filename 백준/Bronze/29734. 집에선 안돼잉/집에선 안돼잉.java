import java.io.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(" ");
        
        long n = Long.parseLong(input[0]);
        long m = Long.parseLong(input[1]);
        
        input = br.readLine().split(" ");
        
        long t = Long.parseLong(input[0]);
        long s = Long.parseLong(input[1]);
        
        long nx = n / 8;
		long ny = n % 8;
		long nm = 8 + s;
		long nt;

		if (ny != 0) {
			nt = (nm * nx) + ny;
		} else {
			nt = (nm * nx) - s;	
		}

		long mx = m / 8;
		long my = m % 8;
		long mm = t + 8 + t + s;
		long mt;
		
		if (my != 0) {
			mt = (mm * mx) + t + my;
		} else {
			mt = (mm * (mx - 1)) + t + 8;
		}
        
        StringBuilder sb = new StringBuilder();
        
        if (nt < mt) {
            sb.append("Zip").append("\n").append(nt);
        } else {
            sb.append("Dok").append("\n").append(mt);
        }
        
        System.out.println(sb);
    }
}