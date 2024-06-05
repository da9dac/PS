import java.io.*;
import java.util.*;

class Main {
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();
        
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        int cnt = 0;
        
        int[] arr = new int[n];
        
        st = new StringTokenizer(br.readLine());
        
        for (int i = 0; i < n; i++) arr[i] = Integer.parseInt(st.nextToken());
        
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    cnt++;
                    
                    int tmp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = tmp;
                    
                    if (cnt == k) {
                        for (int x = 0; x < n; x++) {
                            sb.append(arr[x]).append(" ");
                        }
                        System.out.println(sb);
                        return;
                    }
                }
            }
        }
        
        System.out.println(-1);
    }
}