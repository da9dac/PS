import java.io.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        char[][] arr = new char[2][2];
        
        arr[0] = br.readLine().toCharArray();
        arr[1] = br.readLine().toCharArray();
        
        char a = arr[0][0];
        char b = arr[0][1];
        char c = arr[1][0];
        char d = arr[1][1];
        
        String answer = "NO";
        
        if (a == 'H') {
            if ((b == 'E' && d == 'P' && c == 'C') || (c == 'E' && d == 'P' && b == 'C')) {
                answer = "YES";
            }
        }
        
        if (b == 'H') {
            if ((d == 'E' && c == 'P' && a == 'C') || (a == 'E' && c == 'P' && d == 'C')) {
                answer = "YES";
            }
        }
        
        if (c == 'H') {
            if ((a == 'E' && b == 'P' && d == 'C') || (d == 'E' && b == 'P' && a == 'C')) {
                answer = "YES";
            }
        }
        
        if (d == 'H') {
            if ((c == 'E' && a == 'P' && b == 'C') || (b == 'E' && a == 'P' && c == 'C')) {
                answer = "YES";
            }
        }
        
        System.out.println(answer);
    }
}