class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> result=new ArrayList<>();
        int[] pfreq=new int[26];
        int[] sfreq=new int[26];

        for(char c:p.toCharArray()){
            pfreq[c-'a']++;
        }

        for(int i=0;i<s.length();i++){
            sfreq[s.charAt(i)-'a']++;

            if(i>=p.length()){
                sfreq[s.charAt(i-p.length())-'a']--;
            }

            if(Arrays.equals(pfreq,sfreq)){
                result.add(i-p.length()+1);
            }
        }

        return result;
    }
}