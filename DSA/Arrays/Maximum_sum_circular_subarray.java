class Solution {
    public int maxSubarraySumCircular(int[] nums) {
        int totalSum = 0;
        int maxSum = Integer.MIN_VALUE;
        int minSum = Integer.MAX_VALUE;
        int currMax = 0;
        int currMin = 0;
        
        for (int i=0;i<nums.length;i++) {
            totalSum += nums[i];
            
            currMax+=nums[i];
            if(currMax>maxSum){
                maxSum=currMax;
            }
            if(currMax<0){
                currMax=0;
            }

            currMin+=nums[i];
            if(currMin<minSum){
                minSum=currMin;
            }
            if(currMin>0){
                currMin=0;
            }
            
        }
        if (totalSum == minSum) {
            return maxSum;
        }
        return Math.max(maxSum, totalSum - minSum);
    }
}