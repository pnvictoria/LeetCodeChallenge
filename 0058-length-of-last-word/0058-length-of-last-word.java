class Solution {
    public int lengthOfLastWord(String s) {
        int n = 0;
        s = s.trim();
        for (int i = 0; i < s.length(); i++) {
            n = (s.charAt(i) != ' ') ? n + 1 : 0;
        }
        
        return n;
    }
}