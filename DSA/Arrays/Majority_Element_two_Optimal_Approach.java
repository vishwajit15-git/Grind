import java.util.*;
class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int n=nums.length;
        List<Integer> store=new ArrayList<>();
        int cnt1=0;
        int cnt2=0;
        int el1=Integer.MIN_VALUE;
        int el2=Integer.MIN_VALUE;

        for(int i=0;i<n;i++){
            if(cnt1==0 && nums[i]!=el2){
                cnt1=1;
                el1=nums[i];
            }
            else if(cnt2==0 && nums[i]!=el1){
                cnt2=1;
                el2=nums[i];
            }
            else if(el1 == nums[i]){
                cnt1++;
            }
            else if(el2 == nums[i]){
                cnt2++;
            }
            else{
                cnt1--;
                cnt2--;
            }
        }

        int count1=0;
        int count2=0;
        for(int i=0;i<n;i++){
            if(el1 == nums[i]){
                count1++;
            }
            if(el2 == nums[i]){
                count2++;
            }
        }
        int minimum=(n/3)+1;

        if(count1 >= minimum){
            store.add(el1);
        }

        if(count2 >= minimum){
            store.add(el2);
        }

        Collections.sort(store);
        return store;
    }
}