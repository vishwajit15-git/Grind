class Solution {
    public boolean check(int[] nums) {
        int n= nums.length;

        for(int start=0;start<n;start++){
            int rotated[] =new int[n];

            for(int i=0;i<n;i++){
                rotated[i]=nums[(start+i)%n];
            }

            boolean sorted=true;

            for(int i=1;i<n;i++){
                if(rotated[i]<rotated[i-1]){
                    sorted= false;
                    break;
                }
            }

            if(sorted){
                return true;
            }
        }
        return n==1;
    }
}