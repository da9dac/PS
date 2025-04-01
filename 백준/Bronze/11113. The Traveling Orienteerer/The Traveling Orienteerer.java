import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 총 제어점의 수 입력
        int n = scanner.nextInt();
        double[][] points = new double[n][2];

        // 각 제어점의 좌표 입력
        for (int i = 0; i < n; i++) {
            points[i][0] = scanner.nextDouble();
            points[i][1] = scanner.nextDouble();
        }

        // 경로 수 입력
        int m = scanner.nextInt();

        // 각 경로에 대해 처리
        for (int i = 0; i < m; i++) {
            int p = scanner.nextInt(); // 경로에 포함된 제어점 수
            int[] route = new int[p];
            for (int j = 0; j < p; j++) {
                route[j] = scanner.nextInt();
            }

            // 경로 길이 계산
            double totalDistance = 0;
            for (int j = 0; j < p - 1; j++) {
                int pointA = route[j];
                int pointB = route[j + 1];
                totalDistance += calculateDistance(points[pointA], points[pointB]);
            }

            // 결과 출력 (소수점 없이 반올림)
            System.out.println(Math.round(totalDistance));
        }

        scanner.close();
    }

    // 두 점 사이의 거리 계산 메서드
    private static double calculateDistance(double[] pointA, double[] pointB) {
        double dx = pointA[0] - pointB[0];
        double dy = pointA[1] - pointB[1];
        return Math.sqrt(dx * dx + dy * dy);
    }
}
