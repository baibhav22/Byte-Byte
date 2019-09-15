package com.baibhav.Stack;

public class Driver {

    public static void main(String[] args) {

        Stack stack = new Stack();
        stack.push(23);
        stack.push(33);
        stack.push(10);
        stack.push(11);
        stack.push(21);
        stack.push(9);
        stack.push(11);
        stack.push(11000);
        stack.pop();
        stack.push(17);
        stack.push(10);
        stack.push(118);
        stack.push(101);

        stack.show();




    }

}
