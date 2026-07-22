import java.util.Arrays;

class Solution {
    public int longestConsecutive(int[] nums) {
        int n = nums.length;
        if (n == 0) return 0; 
        Arrays.sort(nums); 
        int lastSmaller = Integer.MIN_VALUE; 
        int cnt = 0; 
        int longest = 1; 
        for (int i = 0; i < n; i++) {
            // Case 1: Current element is exactly one greater than lastSmaller → part of sequence
            if (nums[i] - 1 == lastSmaller) {
                cnt += 1; 
                lastSmaller = nums[i]; 
            } 
            // Case 2: Current element is not consecutive and not a duplicate
            else if (nums[i] != lastSmaller) {
                cnt = 1;
                lastSmaller = nums[i]; 
            }
            longest = Math.max(longest, cnt); 
        }
        return longest;
    }
}