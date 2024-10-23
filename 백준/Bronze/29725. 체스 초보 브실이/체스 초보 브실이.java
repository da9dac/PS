import java.io.*;

class Main {
    
    static int[] score = {0, 3, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 3, 0, 1, 9, 5, 0, 0, 0, 0, 0, 0, 0, 0};
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int sum = 0;
        
        for (int i = 0; i < 8; i++) {
            char[] line = br.readLine().toCharArray();
            
            for (char c : line) {
                if (c == '.') continue;
                if (Character.isUpperCase(c)) {
                    sum += score[c - 'A'];
                } else {
                    sum -= score[c - 'a'];
                }
            }
        }
        
        System.out.println(sum);
    }
}