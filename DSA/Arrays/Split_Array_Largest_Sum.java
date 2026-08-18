class Solution {
    public int splitArray(int[] nums, int k) {
         int n=nums.length;
        if(k>n){
            return -1;
        }
        int low=Arrays.stream(nums).max().getAsInt();
        int high=Arrays.stream(nums).sum();

        while(low<=high){
            int mid=(low+high)/2;

            int noOfsubarr=calcSubarr(nums,mid);
            if(noOfsubarr>k){
                low=mid+1;
            }
            else{
                high=mid-1;
            }
        }
        return low;
    }

    public int calcSubarr(int[] nums,int element){
        int subArr=1;
        int number=0;
        int n=nums.length;

        for(int i=0;i<n;i++){
            if(number+nums[i] <= element){
                number+=nums[i];
            }
            else{
                subArr++;
                number=nums[i];
            }
        }
        return subArr;
    }
}