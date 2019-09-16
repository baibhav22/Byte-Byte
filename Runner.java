package reverseLinkedList;

public class Runner {


    public static void main(String[] args) {
        ReverseLinkedList reverse= new ReverseLinkedList();
//        reverse.push(1);
//        reverse.push(2);
//        reverse.push(3);
//        reverse.push(4);
//        reverse.push(4);
//        reverse.push(5);
//        reverse.push(6);
//        reverse.push(7);
//        reverse.push(8);

//        reverse.show();


        System.out.println("Original: 1->2->3->4");
        Node n = new Node(1);
        n.next = new Node(2);
        n.next.next = new Node(3);
        n.next.next.next = new Node(4);
        reverse.reverseLinkedList(n);


    }


    //reverse.reverseLinkedList(reverse.head);



    }


