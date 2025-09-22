import java.io.*;
import java.util.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int k = Integer.parseInt(br.readLine());
        
        Stack<Integer> stack = new Stack<>();
        
        int sum = 0;
        
        while (k-- > 0) {
            int n = Integer.parseInt(br.readLine());
            
            if (n == 0) {
                sum -= stack.pop();
                continue;
            }
            
            stack.push(n);
            sum += n;
        }
        
        System.out.println(sum);
    }
}