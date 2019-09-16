package reverseLinkedList;

public class ReverseLinkedList {

    Node head;

    public void reverseLinkedList(Node ns){

          if(ns == null)  return;


              reverseLinkedList(ns.next);
              System.out.println(ns.data);

          }





//    public void push(int data){
//        Node h=head;
//
//        Node node= new Node(data);
//        node.data=data;
//        node.next=null;
//
//        if(head==null)
//        {
//        head=node;
//            System.out.println(head.data);
//        }
//
//        else{
//        while(h.next!=null){
//            h=h.next;
//
//        }
//        h.next=node;
//
//        }
//
//    }


    public void show(){

        Node h=head;
        while(h.next!=null){

            h=h.next;
            System.out.println(h.data);
        }


    }



}
