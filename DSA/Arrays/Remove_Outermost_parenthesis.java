class Solution {
    public String removeOuterParentheses(String s) {
        int counter=0;
        StringBuilder result=new StringBuilder();

        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);

            if(ch=='('){
                counter++;
                if(counter>1){
                    result.append(ch);
                }
            }
            else if(ch==')'){
                counter--;
                if(counter>0){
                    result.append(ch);
                }
            }
        }
        return result.toString();
    }
}