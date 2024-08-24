import java.io.*;
import java.util.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

      int n = Integer.parseInt(br.readLine());

      Set<String> set = new TreeSet<>((a, b) -> a.length() != b.length() ? a.length() - b.length() : a.compareTo(b));

      for (int i = 0; i < n; i++) {
         set.add(br.readLine());
      }

      String[] arr = new String[set.size()];

      set.toArray(arr);

      int cnt = 0;

      for (int i = 0; i < arr.length; i++) {
         String s = arr[i];
         boolean found = false;

         for (int j = i + 1; j < arr.length; j++) {
            if (arr[j].startsWith(s)) {
               found = true;
               break;
            }
         }

         if (!found) cnt++;
      }

      System.out.println(cnt);
    }
}