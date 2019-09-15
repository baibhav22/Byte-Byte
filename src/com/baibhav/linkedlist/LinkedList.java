package com.baibhav.linkedlist;

public class LinkedList {

    Node head;               //Refrence pointter
//Method to insert at the end Linkedlist
    public void insert(int data){

        Node node= new Node();
        node.data=data;      //Initilized the value of data
        node.next=null;

        if(head==null){

            head=node;             //Create new node....node=new Node();
        }
        else{

            //Run loop from the head till it finds null
            Node n=head;

            while(n.next!=null){

                n=n.next;

            }
              n.next=node;    //Create new node node= new Node();  Current node

        }
    }
//Method to print the Linkedlist
    public void show(){

        Node node1= head;

        while(node1.next!=null){
            System.out.println(node1.data);
            node1=node1.next;

        }

        }

    public void addonTop(int data){
        Node node= new Node();
        node.data=data;

        node.next=head;
        head=node;


    }



}
