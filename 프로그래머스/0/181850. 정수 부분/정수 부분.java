import java.util.*;

class Solution {
    public int solution(double flo) {
        return Integer.parseInt(new StringTokenizer(Double.toString(flo), ".").nextToken());
    }
}