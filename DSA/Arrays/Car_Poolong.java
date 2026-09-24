class Solution {
    public boolean carPooling(int[][] trips, int capacity) {
        int[] diffArray=new int[1001];

        for(int[] trip:trips){
            int numPassengers=trip[0];
            int start=trip[1];
            int end=trip[2];

            diffArray[start]+=numPassengers;
            diffArray[end]-=numPassengers;
        }

        int currentPassengers=0;
        for(int passengersChange : diffArray){
            currentPassengers+=passengersChange;
            if(currentPassengers>capacity){
                return false;
            }
        }
        return true;
    }
}