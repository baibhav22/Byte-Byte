package Byte.deleteLinkedList;

public class DeleteLinkedList {

    Node head;
    public void push(int data) {

        Node node = new Node();
        node.data=data;

        if(head==null){

            head=node;
            //System.out.println(head.data);
        }

        else{

            Node h= head;
            System.out.println(h.data);
            while(h.next!=null){

                h=h.next;
                System.out.println(h.data);
            }
            h.next=node;
        }

    }

    public int deleteLinkedList(int index){

          Node n=head;
          for(int i=0;i<index-1;i++){

          n=n.next;
       }
         n=n.next.next;
         System.out.println("Deleted node at index" + index + " =>"  + n.data);

        return 0;

    }


    public void addIndex(int index, int data) {


    }


    public void show(){



    }
}
