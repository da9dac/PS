import java.io.*;
import java.util.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int K = Integer.parseInt(br.readLine());

        for (int k = 1; k <= K; k++) {
            String[] firstLine = br.readLine().split(" ");
            int n = Integer.parseInt(firstLine[0]);
            int s = Integer.parseInt(firstLine[1]);
            int p = Integer.parseInt(firstLine[2]);

            int[][] points = new int[n + 1][2];
            for (int i = 0; i <= n; i++) {
                String[] point = br.readLine().split(" ");
                points[i][0] = Integer.parseInt(point[0]);
                points[i][1] = Integer.parseInt(point[1]);
            }

            double totalLength = 0;
            for (int i = 0; i < n; i++) {
                if (points[i][0] == points[i + 1][0]) {
                    totalLength += Math.abs(points[i][1] - points[i + 1][1]);
                } else {
                    totalLength += Math.abs(points[i][0] - points[i + 1][0]);
                }
            }

            double timeRequired = totalLength * s / p;
            int result = (int) Math.ceil(timeRequired);

            sb.append("Data Set ").append(k).append(":\n").append(result).append("\n\n");
        }

        System.out.print(sb.toString());
    }
}