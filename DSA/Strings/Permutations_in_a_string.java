class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int n1=s1.length();
        int n2=s2.length();

        if(n1>n2){
            return false;
        }

        int[] freqs1=new int[26];
        int[] freqs2=new int[26];

        int left=0;

        for(int i=0;i<n1;i++){
            freqs1[s1.charAt(i)-'a']++;
        }

        for(int right=0;right<n2;right++){
            freqs2[s2.charAt(right)-'a']++;

            if(right-left+1>n1){
                freqs2[s2.charAt(left)-'a']--;
                left++;
            }

            if(right-left+1==n1 && matches(freqs1,freqs2)){
                return true;
            }
        }
        return false;
    }

    private boolean matches(int[] freqs1,int[] freqs2){
        for(int i=0;i<26;i++){
            if(freqs1[i]!=freqs2[i]){
                return false;
            }
        }
        return true;
    }
}