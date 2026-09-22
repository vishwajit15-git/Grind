class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        HashSet<Integer> seen=new HashSet<>();

        ArrayList<Integer> duplicate=new ArrayList<>();

        for( int i=0;i<nums.length;i++){
            if(seen.contains(nums[i])){
                duplicate.add(nums[i]);
            }else{
                seen.add(nums[i]);
            }
        }

        return duplicate;
    }
}