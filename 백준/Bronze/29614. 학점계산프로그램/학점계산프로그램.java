import java.io.*;
import java.util.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        String input = br.readLine();
        int len = input.length();
        
        Map<Character, Double> score = new HashMap<>();

        score.put('A', 4.0);
        score.put('B', 3.0);
        score.put('C', 2.0);
        score.put('D', 1.0);
        score.put('F', 0.0);
        
        double sum = 0.0;
        int cnt = 0;
        
        for (int i = 0; i < len; i++) {
            char c = input.charAt(i);
            
            if (c == '+') {
                sum += 0.5;
                continue;
            }
            cnt++;
            sum += score.get(c);
        }
        
        System.out.println(sum / cnt);
    }
}