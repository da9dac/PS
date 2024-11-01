import java.io.*;

class Main {
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        String[] input = br.readLine().split(" ");
        
        int n = Integer.parseInt(input[0]);
        int m = Integer.parseInt(input[1]);
        int k = Integer.parseInt(input[2]);
        
        int s = 0;
        
        if (m >= k) {
            s += k;
            s += (n - m);
        } else {
            k = n - k;
	        s += m;
	        s += k;
        }
        
        System.out.println(s);
    }
}