import java.io.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(" ");
        
        int n = Integer.parseInt(input[0]);
        int k = Integer.parseInt(input[1]);
        int total = 0;
        
        int[][] counts = new int[2][7];
        
        while (n-- > 0) {
            input = br.readLine().split(" ");
            
            int s = Integer.parseInt(input[0]);
            int y = Integer.parseInt(input[1]);
            
            counts[s][y]++;
        }
        
        for (int[] count : counts) {
            for (int cnt : count) {
                int x = cnt / k;
                x = x * k != cnt ? x + 1 : x;
                total += x;
            }
        }
        
        System.out.println(total);
    }
}