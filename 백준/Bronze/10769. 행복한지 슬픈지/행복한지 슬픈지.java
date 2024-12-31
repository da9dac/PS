import java.io.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        String str = br.readLine();
        int len = str.length();
        
        int h = 0;
        int s = 0;
        
        boolean x = false;
        boolean y = false;
        
        for (int i = 0; i < len; i++) {
            char c = str.charAt(i);
            
            if (c != ':' && c != '-' && c != ')' && c != '(') {
                x = false;
                y = false;
                continue;
            }
            
            if (c == ':') {
                x = true;
                continue;
            }
            
            if (c == '-') {
                if (x) {
                    x = false;
                    y = true;
                    continue;
                }
                y = false;
                continue;
            }
            
            if (y) {
                y = false;
                if (c == ')') h++;
                else s++;
            }
        }
        
        System.out.println(h + s == 0 ? "none" : h == s ? "unsure" : h > s ? "happy" : "sad");
    }
}