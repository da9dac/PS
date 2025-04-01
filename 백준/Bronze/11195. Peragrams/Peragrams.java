import java.io.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        String input = br.readLine();
        
        int[] charCount = new int[26];
        
        for (char c : input.toCharArray()) {
            charCount[c - 'a']++;
        }
        
        int oddCount = 0;
        for (int count : charCount) {
            if (count % 2 != 0) {
                oddCount++;
            }
        }
        
        int result = Math.max(0, oddCount - 1);
        
        System.out.println(result);
    }
}
