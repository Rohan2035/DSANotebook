package com.dsa.stack;

class MinStack {

    private int[] stack;
    private int top;

    public MinStack() {

        this.stack = new int[Integer.MAX_VALUE];
        this.top = -1;

    }

    public void push(int val) {

        this.stack[++ top] = val;

    }

    public void pop() {

        top --;

    }

    public int top() {

        return this.stack[top];

    }

    public int getMin() {

        int min = this.stack[0];

        for(int i = 0; i <= top; i ++) if(this.stack[i] < min)  min = this.stack[i];

        return min;

    }

}
