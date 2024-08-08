import java.io.*;
import java.util.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        boolean[] isUsed = new boolean[12];
        
        for (int i = 0; i < 7; i++) {
            st = new StringTokenizer(br.readLine());
            
            int m = Integer.parseInt(st.nextToken());
            int d = Integer.parseInt(st.nextToken());
            
            isUsed[getStar(m, d)] = true;
        }
        
        int n = Integer.parseInt(br.readLine());
        
        People[] peoples = new People[n];
        
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            
            int m = Integer.parseInt(st.nextToken());
            int d = Integer.parseInt(st.nextToken());
            
            peoples[i] = new People(m, d);
        }
        
        Arrays.sort(peoples);
        
        StringBuilder sb = new StringBuilder();
        int cnt = 0;
        
        for (int i = 0; i < n; i++) {
            People p = peoples[i];
            
            int m = p.m;
            int d = p.d;
            
            if (!isUsed[getStar(m, d)]) {
                cnt++;
                sb.append(m).append(" ").append(d).append("\n");
            }
        }
        
        System.out.println(cnt != 0 ? sb : "ALL FAILED");
    }
    
    static class People implements Comparable<People> {
        int m, d;
        
        People(int m, int d) {
            this.m = m;
            this.d = d;
        }
        
        public int compareTo(People other) {
            return m != other.m ? m - other.m : d - other.d;
        }
    }
    
    static int getStar(int m, int d) {        
        if (m == 1) {
            if (d < 20) return 11;
            else return 0;
        } else if (m == 2) {
            if (d < 19) return 0;
            else return 1;
        } else if (m == 3) {
            if (d < 21) return 1;
            else return 2;
        } else if (m == 4) {
            if (d < 20) return 2;
            else return 3;
        } else if (m == 5) {
            if (d < 21) return 3;
            else return 4;
        } else if (m == 6) {
            if (d < 22) return 4;
            else return 5;
        } else if (m == 7) {
            if (d < 23) return 5;
            else return 6;
        } else if (m == 8) {
            if (d < 23) return 6;
            else return 7;
        } else if (m == 9) {
            if (d < 23) return 7;
            else return 8;
        } else if (m == 10) {
            if (d < 23) return 8;
            else return 9;
        } else if (m == 11) {
            if (d < 23) return 9;
            else return 10;
        } else {
            if (d < 22) return 10;
            else return 11;
        }
    }
}