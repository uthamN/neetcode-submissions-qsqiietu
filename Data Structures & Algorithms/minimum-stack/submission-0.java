class MinStack {
    List<Integer> stack = null;
    int l;
    int min;
    
    public MinStack() {
        this.stack = new LinkedList<>();
        this.l = 0;
    }
    
    public void push(int val) {
        this.stack.add(val);
        this.l += 1;
        if (this.l == 1) {
            this.min = val;
        } else {
            if (val < this.min ) {
                this.min = val;
            }
        }
    }
    
    public void pop() {
        this.l-=1;
        int temp = this.stack.get(this.l);
        this.stack.remove(this.l);
        if (this.min == temp) {
            this.min = reCalculateMin();
        }
    }
    
    public int top() {
        return this.stack.get(this.l - 1);
    }
    
    public int getMin() {
        return this.min;
    }

    private int reCalculateMin() {
        int temp = Integer.MAX_VALUE;
        for(int i: this.stack) {
            if (i < temp) {
                temp = i;
            }
        }
        return temp;
    }

}
