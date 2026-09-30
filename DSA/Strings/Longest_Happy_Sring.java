class Solution {
    public String longestPrefix(String s) {
        int[] lps = new int[s.length()];
        computeLPS(s, lps);
        int longestLPSLength = lps[s.length() - 1];

        return s.substring(0,longestLPSLength);
    }
    private void computeLPS(String pattern, int[] lps) {
        int M = pattern.length();
        int len = 0; 
        
        lps[0] = 0; 
        int i = 1;
        
        while (i < M) {
            if (pattern.charAt(i) == pattern.charAt(len)) {
                len++;
                lps[i] = len;
                i++;
            } else {
                if (len != 0) {
                    len = lps[len - 1];
                } else {
                    lps[i] = 0;
                    i++;
                }
            }
        }
    }
}