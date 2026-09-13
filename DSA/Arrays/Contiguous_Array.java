class Solution {
    public int findMaxLength(int[] nums) {
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0){
                nums[i]=-1;
            }
        }

        int maxlen=0;
        int sum=0;

        Map<Integer,Integer> map=new HashMap<>();
        map.put(0,-1);

        for(int i=0;i<nums.length;i++){
            sum+=nums[i];

            if(map.containsKey(sum)){
                int lastseen=map.get(sum);
                maxlen=Math.max(maxlen,i-lastseen);
            }else{
                map.put(sum,i);
            }
        }
        return maxlen;
    }
}