import java.io.*;

class Main {
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        
        String[] strs = new String[5];
        
        for (int i = 0; i < 5; i++) strs[i] = br.readLine();
        
        for (int i = 0; i < 15; i++) {
            for (int j = 0; j < 5; j++) {
                if (strs[j].length() <= i) continue;
                sb.append(strs[j].charAt(i));
            }
        }
        
        System.out.println(sb);
    }
}