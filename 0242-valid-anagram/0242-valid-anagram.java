import java.util.Arrays;

class Solution {
    public boolean isAnagram(String s, String t) {
        char[] arrS = s.toCharArray();
        char[] arrT = t.toCharArray();
        Arrays.sort(arrS);
        Arrays.sort(arrT);
        if (arrS.length != arrT.length) {
            return false;
        }
        return Arrays.equals(arrS, arrT);
    }
}