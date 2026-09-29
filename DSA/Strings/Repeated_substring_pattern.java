class Solution {
    public boolean repeatedSubstringPattern(String s) {
        String doubled=s+s;
        String striped=doubled.substring(1,doubled.length()-1);
        return striped.contains(s);
    }
}