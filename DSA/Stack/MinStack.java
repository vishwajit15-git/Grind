class MinStack {
    private Stack<Long> stk;
    private long min;   
    public MinStack() {
        stk=new Stack<>();
    }
    
    public void push(int val) {
        if(stk.isEmpty()){
            min=val;
            stk.push((long)val);
        }else{
            if(val>min){
                stk.push((long)val);
            }else{
                stk.push(2L*val-min);
                min=val;
            }
        }
    }
    
    public void pop() {
        if(stk.isEmpty()){
            return;
        }
        long x=stk.peek();
        stk.pop();
        if(x<min){
            min=2*min-x;
        }
    }
    
    public int top() {
        long x=stk.peek();
        if (x >= min) return (int)x;

        return (int)min;
    }
    
    public int getMin() {
        return (int)min;
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */
