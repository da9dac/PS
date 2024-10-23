import java.io.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int white = 0;
        int black = 0;
        
        int[] score = new int[26];
        
        score['p' - 'a'] = 1;
        score['n' - 'a'] = 3;
        score['b' - 'a'] = 3;
        score['r' - 'a'] = 5;
        score['q' - 'a'] = 9;
        
        for (int i = 0; i < 8; i++) {
            char[] line = br.readLine().toCharArray();
            
            for (char c : line) {
                if (c == '.') continue;
                if (Character.isUpperCase(c)) {
                    white += score[c - 'A'];
                } else {
                    black += score[c - 'a'];
                }
            }
        }
        
        System.out.println(white - black);
    }
}