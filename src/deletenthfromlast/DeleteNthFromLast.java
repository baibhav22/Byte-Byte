package deletenthfromlast;
//1.   Main logic is find the total number of nodes
//2.   Second if you have to find nth from last element from the last then run the loop which is (count-n)


//Then you can just delete in the same way you deleted the linkedlist ear;ier



public class DeleteNthFromLast {

    Node head;
    public void push(int data){

        Node n=head;
        Node node=new Node();

        node.data=data;
        node.next=null;

        if(head==null){

            head=node;
            System.out.println(head.data);
        }

        else{

            while(n.next!=null){

                n=n.next;

            }
            n.next=node;
        }


    }
    
    public void deleteLinkedList(int index){


    }

    public void show(){

        Node n=head;
        while(n.next!=null){

            n=n.next;
            System.out.println(n.data);
        }



    }
    }

