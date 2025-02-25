import java.io.*;
import java.math.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        BigInteger a = new BigInteger(br.readLine());
        String op = br.readLine();
        BigInteger b = new BigInteger(br.readLine());
        
        if (op.equals("+")) {
            System.out.println(a.add(b).toString());
        } else {
            System.out.println(a.multiply(b).toString());
        }
    }
}