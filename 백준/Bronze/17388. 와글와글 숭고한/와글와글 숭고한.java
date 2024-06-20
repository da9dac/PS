import java.io.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] arr = br.readLine().split(" ");
        String[] unvs = {"Soongsil", "Korea", "Hanyang"};
        int min = 101;
        int sum = 0;
        String unv = "";
        
        for (int i = 0; i < 3; i++) {
            int x = Integer.parseInt(arr[i]);
            sum += x;
            if (x < min) {
                min = x;
                unv = unvs[i];
            }
        }
        
        System.out.println(sum >= 100 ? "OK" : unv);
    }
}