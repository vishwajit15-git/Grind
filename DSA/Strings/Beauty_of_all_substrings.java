class Solution {
    public int beautySum(String s) {
        int sum=0;

        for(int i=0;i<s.length();i++){
            int[] freq=new int[26];
            for(int j=i;j<s.length();j++){
                freq[s.charAt(j)-'a']++;

                int beauty=getMaxCount(freq)-getMinCount(freq);
                sum+=beauty;
            }
        }
        return sum;
    }

    public int getMaxCount(int [] freq){
        int maxCount=0;
        for(int i=0;i<26;i++){
            maxCount=Math.max(freq[i],maxCount);
        }
        return maxCount;
    }

    public int getMinCount(int [] freq){
        int minCount=Integer.MAX_VALUE;
        for(int i=0;i<26;i++){
            if(freq[i]!=0){
            minCount=Math.min(freq[i],minCount);
            }
        }
        return minCount;
    }

}