import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int count = 1;

        while (true) {
            String n = in.next();

            if (n.equals("0")) break;

            while (true) {
                StringBuilder sb = new StringBuilder();

                if (n.length() % 2 == 1) break;

                for (int i = 0; i < n.length(); i += 2) {
                    int idx = Integer.parseInt(n.charAt(i) + "");

                    for (int j = 0; j < idx; j++)
                        sb.append(n.charAt(i + 1));
                }

                if (n.equals(sb.toString())) break;

                n = sb.toString();
            }

            System.out.println("Test " + count++ + ": " + n);
        }
    }
}