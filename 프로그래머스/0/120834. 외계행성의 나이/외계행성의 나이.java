class Solution {
    public String solution(int age) {
        String strAge = Integer.toString(age);
        
        StringBuilder sb = new StringBuilder();
        
        for (int i = 0; i < strAge.length(); i++) {
            sb.append((char)('a' + (strAge.charAt(i) - '0')));
        }
        
        return sb.toString();
    }
}