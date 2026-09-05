class Solution {
    public String largestOddNumber(String num) {
        int right=-1;
        for(int i=num.length()-1;i>=0;i--){
            if(num.charAt(i)%2!=0){
                right=i;
                break;
            }
        }
        if(right == -1){
            return "";
        }

        int left=0;
        while(left<=right && num.charAt(left)=='0'){
            left++;
        }

        return num.substring(left,right+1);
    }
}