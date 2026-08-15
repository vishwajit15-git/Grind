class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int low=1;
        int high= maxElement(piles);

        while(low<=high){
            int mid=(low+high)/2;

            int total_hrs=totalHours(piles,mid);

            if(total_hrs<=h){
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }return low;
    }
    public int maxElement(int[] piles){
        int n=piles.length;
        int maxi=Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            maxi=Math.max(maxi,piles[i]);
        }
        return maxi;
    }

    public int totalHours(int[] piles,int hourly){
        int n=piles.length;
        int totalH=0;
        for(int i=0;i<n;i++){
            totalH+=Math.ceil((double)piles[i]/(double)hourly);
        }
        return totalH;
    }
}