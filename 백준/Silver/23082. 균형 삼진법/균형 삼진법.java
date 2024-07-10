import java.io.*;

class Main {
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int n = Integer.parseInt(br.readLine());
        
        String answer;
        
        if (n == 0) {
            answer = "0";
        }
        else {
            StringBuilder sb = new StringBuilder();
            int remain;
            
            while (n != 0) {
                remain = n % 3;
                n /= 3;
                
                if (remain < 0) {
                remain += 3;
                n--;
             }

             if (remain == 2) {
                sb.append('T');
                n++;
             } else sb.append(remain);
            }
            answer = sb.reverse().toString();
        }
        System.out.println(answer);
    }
}