import java.io.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        String s = br.readLine();
        
        String[] arr = br.readLine().split(" ");
        
        boolean[] isLower = new boolean[26];
        
        for (String a : arr) isLower[a.charAt(0) - 'A'] = true;
        
        StringBuilder sb = new StringBuilder();
        
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (Character.isUpperCase(c) && isLower[c - 'A']) {
                sb.append(Character.toLowerCase(c));
            } else {
                sb.append(c);
            }
        }
        
        System.out.println(sb);
    }
}