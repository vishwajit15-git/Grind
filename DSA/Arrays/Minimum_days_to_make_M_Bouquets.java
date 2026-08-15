class Solution {
    public int minDays(int[] bloomDay, int m, int k) {
        int mini=Arrays.stream(bloomDay).min().getAsInt();
        int maxi=Arrays.stream(bloomDay).max().getAsInt();

        long val=(long)m*(long)k;
        long n=bloomDay.length;
        if(val>n){
            return -1;
        }

        int low=mini;
        int high=maxi;

        while(low<=high){
            int mid=(low+high)/2;

            if(IsPossible(bloomDay,mid,m,k)== true){
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        return low;
    }

    public boolean IsPossible(int[] bloomDay,int day,int m,int k){
        int cnt=0;
        int noOfB=0;
        int n=bloomDay.length;

        for(int i=0;i<n;i++){
            if(bloomDay[i]<=day){
                cnt++;
            }
            else{
                noOfB+=(cnt/k);
                cnt=0;
            }
        }
        noOfB+=(cnt/k);

        return noOfB>=m;
    }
}