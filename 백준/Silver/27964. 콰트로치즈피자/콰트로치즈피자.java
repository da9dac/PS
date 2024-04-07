import java.io.*;
import java.util.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        br.readLine();
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        Set<String> cheese = new HashSet<>();
        
        while (st.hasMoreTokens()) {
            String c = st.nextToken();

			if (c.endsWith("Cheese")) cheese.add(c);
        }
        
        System.out.println(cheese.size() > 3 ? "yummy" : "sad");
    }
}