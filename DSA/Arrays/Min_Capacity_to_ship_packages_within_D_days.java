class Solution {
    public int shipWithinDays(int[] weights, int days) {
        int maxi=Arrays.stream(weights).max().getAsInt();
        int sum=Arrays.stream(weights).sum();
        int low=maxi;
        int high=sum;

        while(low<=high){
            int mid=(low+high)/2;

            int daysReq=daysCalc(weights,mid);
            if(daysReq<=days){
                high=mid-1;
            }else{
                low=mid+1;
            }
        }
        return low;
    }

    public int daysCalc(int[] weights, int cap){
        int days=1;
        int load=0;
        int n=weights.length;
        for(int i=0;i<n;i++){
            if(load+weights[i]>cap){
                days=days+1;
                load=weights[i];
            }else{
                load+=weights[i];
            }
        }
        return days;
    }
}