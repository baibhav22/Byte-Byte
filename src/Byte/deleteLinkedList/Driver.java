package Byte.deleteLinkedList;

public class Driver {


    public static void main(String[] args) {


        DeleteLinkedList obj= new DeleteLinkedList();


        obj.push(23);
        obj.push(24);
        obj.push(25);
        obj.push(26);
        obj.push(27);
        obj.push(28);
        obj.push(29);
        obj.push(30);

        obj.deleteLinkedList(4);



        obj.show();



    }





}
