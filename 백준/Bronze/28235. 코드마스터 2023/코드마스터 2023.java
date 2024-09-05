import java.io.*;
import java.util.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        String s = br.readLine();
        
        if (s.equals("SONGDO")) {
            System.out.println("HIGHSCHOOL");
        } else if (s.equals("CODE")) {
            System.out.println("MASTER");
        } else if (s.equals("2023")) {
            System.out.println("0611");
        } else {
            System.out.println("CONTEST");
        }
    }
}