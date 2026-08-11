class Solution {
    public int lowerBound(int[]arr,int n,int x){
        int l=arr.length;
        int low=0;
        int high=l-1;
        int ans=l;

        while(low<=high){
            int mid=(low+high)/2;
            if(arr[mid]>=x){
                ans=mid;
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        return ans;
    }

        public int upperBound(int[]arr,int n,int x){
        int l=arr.length;
        int low=0;
        int high=l-1;
        int ans=l;

        while(low<=high){
            int mid=(low+high)/2;
            if(arr[mid]>x){
                ans=mid;
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        return ans;
    }
    public int[] searchRange(int[] nums, int target) {
        int n=nums.length;
        int lb=lowerBound(nums,n,target);
        if(lb == n || nums[lb]!= target){
            return new int[]{-1,-1};
        }
        return new int[]{lb,upperBound(nums,n,target)-1};
    }
}