import java.io.*;

import java.util.*;

public class Main {

    

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        

        int n = Integer.parseInt(br.readLine());

        int[] costs = new int[n];

        int[] dists = new int[n - 1];

        

        StringTokenizer st = new StringTokenizer(br.readLine());

        

        for (int i=0; i<n-1; i++) {

            dists[i] = Integer.parseInt(st.nextToken());

        }

        

        st = new StringTokenizer(br.readLine());

        

        for (int i=0; i<n; i++) {

            costs[i] = Integer.parseInt(st.nextToken());

        }

        

        long min = costs[0];

        long sum = min * dists[0];

        

        for (int i=1; i<n-1; i++) {

            if (min > costs[i]) {

                min = costs[i];

            }

            sum += (min * dists[i]);

        }

        

        System.out.println(sum);

    }

    

}