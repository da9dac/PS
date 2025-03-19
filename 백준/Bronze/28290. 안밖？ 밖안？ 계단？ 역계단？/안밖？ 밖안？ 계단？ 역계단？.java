import java.io.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        String s = br.readLine();
        String answer;
        
        if (s.equals("asdfjkl;")) answer = "stairs";
        else if (s.equals(";lkjfdsa")) answer = "reverse";
        else if (s.equals("asdf;lkj") || s.equals(";lkjasdf")) answer = "out-in";
        else if (s.equals("fdsajkl;") || s.equals("jkl;fdsa")) answer = "in-out";
        else answer = "molu";
        
        System.out.println(answer);
    }
}