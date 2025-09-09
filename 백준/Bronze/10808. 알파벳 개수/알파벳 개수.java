import java.io.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        String s = br.readLine();
        
        int[] count = new int['z' - 'a' + 1];
        
        for (int i = 0; i < s.length(); i++) count[s.charAt(i) - 'a']++;
        
        StringBuilder sb = new StringBuilder();
        
        for (int i = 0; i < count.length; i++) sb.append(count[i]).append(" ");
        
        System.out.println(sb);
    }
}