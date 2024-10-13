import java.io.*;
import java.util.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        char[] a = st.nextToken().toCharArray();
        char[] b = st.nextToken().toCharArray();
        
        int min = 0;
        int max = 0;
        
        StringBuilder x = new StringBuilder();
        StringBuilder y = new StringBuilder();
        
        for (char c : a) {
            if (c == '5') {
                x.append(c);
                y.append(6);
            } else if (c == '6') {
                x.append(5);
                y.append(c);
            } else {
                x.append(c);
                y.append(c);
            }
        }
        
        min += Integer.parseInt(x.toString());
        max += Integer.parseInt(y.toString());
        
        x = new StringBuilder();
        y = new StringBuilder();
        
        for (char c : b) {
            if (c == '5') {
                x.append(c);
                y.append(6);
            } else if (c == '6') {
                x.append(5);
                y.append(c);
            } else {
                x.append(c);
                y.append(c);
            }
        }
        
        min += Integer.parseInt(x.toString());
        max += Integer.parseInt(y.toString());
        
        System.out.println(min + " " + max);
    }
}