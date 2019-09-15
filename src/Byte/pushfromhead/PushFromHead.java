package Byte.pushfromhead;

public class PushFromHead {

    Node head;

    public void pushfromhead(int data){

        Node h=head;
        Node node = new Node();
        node.data=data;
        {
            if(head==null){

                head=node;
                System.out.print(node.data + " ");
            }

            else{

                node.next=head;
                head=node;
                System.out.print(node.data+ " ");
        }

        }
    }

//    public void show(){
//
//            Node n=head;
//            while(n.next!=null){
//
//                n=n.next;
//                System.out.println(n.data);
//            }
//
//        }




    }



