import java.io.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int t = Integer.parseInt(br.readLine());
        
        int a = 300;
        int b = 60;
        int c = 10;
        
        int ac = t / a;
        t %= a;
        int bc = t / b;
        t %= b;
        int cc = t / c;
        t %= c;
        
        System.out.println(t == 0 ? ac + " " + bc + " " + cc : -1);
    }
}