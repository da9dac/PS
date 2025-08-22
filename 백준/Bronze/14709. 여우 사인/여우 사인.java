import java.io.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        boolean a = false;
        boolean b = false;
        boolean c = false;
        boolean x = false;
        
        int n = Integer.parseInt(br.readLine());
        
        while (n-- > 0) {
            String s = br.readLine();
            
            if (s.equals("1 3") || s.equals("3 1")) a = true;
            else if (s.equals("4 3") || s.equals("3 4")) b = true;
            else if (s.equals("1 4") || s.equals("4 1")) c = true;
            else x = true;
        }
        
        System.out.println(a && b && c && !x ? "Wa-pa-pa-pa-pa-pa-pow!" : "Woof-meow-tweet-squeek");
    }
}