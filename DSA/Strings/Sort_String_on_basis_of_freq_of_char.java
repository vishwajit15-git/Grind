class Solution {
    class Pair{
        int freq;
        char ch;
        Pair(int f,char c){
            this.freq=f;
            this.ch=c;            
        }
    }
    public String frequencySort(String s) {
        Pair[] freq=new Pair[62];

        for(int i=0;i<26;i++){
            freq[i]=new Pair(0,(char)(i+'a'));
        }

        for(int i=0;i<26;i++){
            freq[i+26]=new Pair(0,(char)(i+'A'));
        }

        for(int i = 0; i < 10; i++) {
            freq[i+52] = new Pair(0, (char)(i + '0'));
        }

        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);

            if(ch>='a' && ch<='z'){
                freq[ch-'a'].freq++;
            }else if(ch>='A' && ch<='Z'){
                freq[ch-'A'+26].freq++;
            }else if(ch >= '0' && ch <= '9') { 
                freq[ch - '0' + 52].freq++; 
            }
        }

        Arrays.sort(freq,(p1,p2)-> p2.freq-p1.freq);

        StringBuilder result=new StringBuilder();

        for(int i=0;i<freq.length;i++){
            Pair p=freq[i];

            if(p.freq==0){
                break;
            }

            for(int j=0;j<p.freq;j++){
                result.append(p.ch);
            }
        }
        return result.toString();
    }
}