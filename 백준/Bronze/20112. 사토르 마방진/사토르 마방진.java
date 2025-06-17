import java.io.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int n = Integer.parseInt(br.readLine());
        
        char[][] arr = new char[n][n];
        
        for (int i = 0; i < n; i++) {
            String s = br.readLine();
            
            for (int j = 0; j < n; j++) {
                arr[i][j] = s.charAt(j);
            }
        }
        
        System.out.println(isSator(arr, n) ? "YES" : "NO");
    }
    
    static boolean isSator(char[][] arr, int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (arr[i][j] != arr[j][i]) return false;
            }
        }
        
        return true;
    }
}