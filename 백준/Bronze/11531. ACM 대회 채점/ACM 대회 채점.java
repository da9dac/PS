import java.io.*;
import java.util.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        String input;
        final String END = "-1";
        final String RIGHT = "right";
        
        Map<String, Integer> map = new HashMap<>();
        
        int rightCnt = 0;
        int sum = 0;
        
        while (!(input = br.readLine()).equals(END)) {
            st = new StringTokenizer(input);
            
            int m = Integer.parseInt(st.nextToken());
            String name = st.nextToken();
            boolean isRight = st.nextToken().equals(RIGHT);
            
            if (isRight) {
                int wrongCnt = map.getOrDefault(name, 0);
                
                rightCnt++;
                sum += (m + wrongCnt * 20);
            } else {
                map.put(name, map.getOrDefault(name, 0) + 1);
            }
        }
        
        System.out.println(rightCnt + " " + sum);
    }
}