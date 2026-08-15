class Solution {
    public int smallestDivisor(int[] nums, int threshold) {
         int n=nums.length;
        if(n>threshold){
            return -1; 
        }
        int maxi=Arrays.stream(nums).max().getAsInt();
        int low=1;
        int high=maxi;
        while(low<=high){
            int mid=(low+high)/2;

            if(divideSum(nums,mid,threshold)<=threshold){
                high=mid-1;
            }
            else{
                low=mid+1;
            }
           
        }
         return low;
    }
    public int divideSum(int [] nums,int d,int threshold ){
        int ans=0;
        int n=nums.length;
        for(int i=0;i<n;i++){
            ans+=(int)Math.ceil((double)nums[i]/d);
        }
        return ans;
    }
}