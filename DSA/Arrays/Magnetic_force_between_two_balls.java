class Solution {
    public int maxDistance(int[] position, int m) {
        Arrays.sort(position);
        int n=position.length;
        int low=1;
        int high=position[n-1]-position[0];

        while(low<=high){
            int mid=(low+high)/2;

            if(canWePlace(position,mid,m)==true){
               low=mid+1;
            }
            else{
                high=mid-1;
            }
        }
        return high;
    }

    public boolean canWePlace(int[] position,int dist,int m){
        int n=position.length;
        int countBalls=1;
        int lastPlacedBall=position[0];

        for(int i=1;i<n;i++){
            if(position[i]-lastPlacedBall>=dist){
                countBalls++;
                lastPlacedBall=position[i];
            }
            if(countBalls>=m){
                return true;
            }
        }
        return false;
    }
}