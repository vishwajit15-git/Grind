class Solution {
    public boolean isPalindrome(String str) {
        int left = 0;
        int right = str.length() - 1;

        while (left < right) {
            while (left < right && !Character.isLetterOrDigit(str.charAt(left))) {
                left++;
            }
            while (left < right && !Character.isLetterOrDigit(str.charAt(right))) {
                right--;
            }
            char l = Character.toLowerCase(str.charAt(left));
            char r = Character.toLowerCase(str.charAt(right));

            if (l != r) {
                return false;
            }
            left++;
            right--;
        }

        return true;
    }
}
