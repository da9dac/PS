import java.util.*;

class Solution {
    public int solution(String[] s1, String[] s2) {
        int answer = s1.length + s2.length;
        
        Set<String> set = new HashSet<>();
        
        for (String s : s1) set.add(s);
        
        for (String s : s2) set.add(s);
        
        return answer - set.size();
    }
}