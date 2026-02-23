class Solution {
    public int scoreDifference(int[] nums) {
        int sum=0;
        boolean player=true;

        for(int i=0;i<nums.length;i++){
            if(nums[i]%2==1){
                player=!player;
            }
            if((i+1)%6==0){
                player=!player;
            }

            if(player){
                sum+=nums[i];
            }
            else{
                sum-=nums[i];
            }
        }
        return sum;
    }
}