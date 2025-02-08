import java.io.*;
import java.util.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        Map<String, String> morseToChar = new HashMap<>();
        
        morseToChar.put(".-", "A");
        morseToChar.put("-...", "B");
        morseToChar.put("-.-.", "C");
        morseToChar.put("-..", "D");
        morseToChar.put(".", "E");
        morseToChar.put("..-.", "F");
        morseToChar.put("--.", "G");
        morseToChar.put("....", "H");
        morseToChar.put("..", "I");
        morseToChar.put(".---", "J");
        morseToChar.put("-.-", "K");
        morseToChar.put(".-..", "L");
        morseToChar.put("--", "M");
        morseToChar.put("-.", "N");
        morseToChar.put("---", "O");
        morseToChar.put(".--.", "P");
        morseToChar.put("--.-", "Q");
        morseToChar.put(".-.", "R");
        morseToChar.put("...", "S");
        morseToChar.put("-", "T");
        morseToChar.put("..-", "U");
        morseToChar.put("...-", "V");
        morseToChar.put(".--", "W");
        morseToChar.put("-..-", "X");
        morseToChar.put("-.--", "Y");
        morseToChar.put("--..", "Z");
        
        morseToChar.put(".----", "1");
        morseToChar.put("..---", "2");
        morseToChar.put("...--", "3");
        morseToChar.put("....-", "4");
        morseToChar.put(".....", "5");
        morseToChar.put("-....", "6");
        morseToChar.put("--...", "7");
        morseToChar.put("---..", "8");
        morseToChar.put("----.", "9");
        morseToChar.put("-----", "0");
        
        morseToChar.put("--..--", ",");
        morseToChar.put(".-.-.-", ".");
        morseToChar.put("..--..", "?");
        morseToChar.put("---...", ":");
        morseToChar.put("-....-", "-");
        morseToChar.put(".--.-.", "@");
        
        StringBuilder sb = new StringBuilder();
        
        for (int i = 0; i < n; i++) {
            sb.append(morseToChar.get(st.nextToken()));
        }
        
        System.out.println(sb);
    }
}