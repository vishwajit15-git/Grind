class Solution {
    public String removeOccurrences(String s, String part) {
        StringBuilder result=new StringBuilder();
        int n=s.length();
        int m=part.length();

        for(int i=0;i<n;i++){
            result.append(s.charAt(i));

            if(result.length()>=m){
                String sub=result.substring(result.length()-m);
                if(sub.equals(part)){
                    result.delete(result.length()-m,result.length());
                }
            }
        }
        return result.toString();
    }
}