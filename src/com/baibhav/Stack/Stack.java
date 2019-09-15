package com.baibhav.Stack;

public class Stack {

    int top = 0;

    // int size ;

//    public Stack(int size) {
//        this.size = size;
//        //top =  -1;
//    }
//  public void setSize(){
//
//       this.size=size;
//}
  // public int getSize(int size){
//
//        return size;
//    }
    public boolean isEmpty(){

        return top<0;

    }

    int array[]= new int[12];

    public void push(int data){
         array[top]=data;
         top++;
    }

    public int pop(){
       return array[top --];
      // top -- ;


    }

    public void show(){

        for(int i=0; i< array.length;i++){
            System.out.print( array[i]+ " ");
        }



    }




}
