class Solution {
    public boolean isValid(String s) {
        Stack <Character> stk= new Stack<>();

        for(int i=0;i<s.length();i++){
            char curr=s.charAt(i);
            if(curr=='(' ||curr=='{' ||curr=='[' ){
                stk.push(curr);
            }
            else{
                if(stk.isEmpty()){return false;}
                char top=stk.peek();
                if((curr==')' && top=='(')||(curr=='}' && top=='{')||(curr==']' && top=='[')){
                    stk.pop();
                }else{
                    return false;
                }
            }
    }

    return stk.isEmpty();
}
}