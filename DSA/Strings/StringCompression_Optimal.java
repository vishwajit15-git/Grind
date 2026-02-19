class Solution {
    public int compress(char[] chars) {
        int i=0;
        int writer=0;

        while(i<chars.length ){
            char current=chars[i];
            Integer count=0;
            while(i<chars.length && chars[i]==current){
                i++;
                count++;
            }

            chars[writer++]=current;

            if(count>1){
                String ans=count.toString();
                for(int k=0;k<ans.length();k++){
                    char curr=ans.charAt(k);
                        chars[writer++]=curr;
                }
            }
        }
        return writer;
    }
}