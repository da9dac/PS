import java.io.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int n = Integer.parseInt(br.readLine());
        
        String str = br.readLine();
        
        int[] count = new int[26];
        
        for (int i = 0; i < n; i++) count[str.charAt(i) - 'A']++;
        
        int max = Math.min(count[4] / 2, count[17] / 2);
        int min = Math.min(count[1], Math.min(count[8], Math.min(count[11], Math.min(count[13], Math.min(count[14], Math.min(count[18], Math.min(count[21], count[25])))))));
        
        System.out.println(Math.min(min, max));
    }
} 