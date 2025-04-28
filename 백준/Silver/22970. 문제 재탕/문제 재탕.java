import java.io.*;
import java.util.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int n = Integer.parseInt(br.readLine());
        
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        int[] arr = new int[n];
        
        for (int i = 0; i < n; i++) arr[i] = Integer.parseInt(st.nextToken());

        int max = 1;
        
        for (int i = 1, j, k; i < n; max = Math.max(max, k - i + 1), i = j + 1) {
            j = i;
            while (j < n && arr[j - 1] < arr[j]) j++;
            k = j;
            while (k < n && arr[k - 1] > arr[k]) k++;
        }
        
        System.out.println(max);
    }
}