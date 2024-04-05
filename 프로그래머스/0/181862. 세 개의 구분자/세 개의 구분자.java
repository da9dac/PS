class Solution {
    public String[] solution(String myStr) {
        myStr = myStr.replaceAll("[a-c]", " ");
        String[] result = myStr.trim().split(" +");
        
        return result[0].isEmpty() ? new String[]{"EMPTY"} : result;
    }
}