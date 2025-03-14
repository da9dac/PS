import java.io.*;
import java.util.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();
        
        int[] arr = new int[5];
        
        for (int i = 0; i < 5; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        
        while (true) {
            for (int i = 0; i < 4; i++) {
                if (arr[i] > arr[i + 1]) {
                    int tmp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = tmp;
                    
                    for (int j = 0; j < 5; j++) {
                        sb.append(arr[j]).append(" ");
                    }
                    sb.append("\n");
                }
            }
            
            boolean isEnd = true;
            
            for (int i = 0; i < 5; i++) {
                if (i + 1 != arr[i]) {
                    isEnd = false;
                }
            }
            
            if (isEnd) break;
        }
        
        System.out.println(sb);
    }
}