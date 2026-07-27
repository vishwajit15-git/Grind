class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int n=nums.length;
        List<Integer> store=new ArrayList<>();

        for(int i=0;i<n;i++){
            if(store.size()==0 || store.get(0)!=nums[i]){
                int count=0;
                for(int j=0;j<n;j++){
                    if(nums[j]==nums[i]){
                        count++;
                    }
                }
                if(count>n/3){
                    store.add(nums[i]);
                }
            }

            if(store.size() == 2 ){
                break;
            }
        }
        return store;
    }
}