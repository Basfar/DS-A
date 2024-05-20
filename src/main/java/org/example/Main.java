package org.example;

import org.example.LinkedList.LinkedList;

public class Main {
    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList(1);
        linkedList.append(2);
        linkedList.append(3);
        linkedList.append(4);

        System.out.println(linkedList.findKthFromEnd(2).value);


       // linkedList.insert(1,5);

      //  System.out.println(linkedList.get(1).value);


//        System.out.println(linkedList.removeLast().value);
//        System.out.println(linkedList.removeLast().value);
//        System.out.println(linkedList.removeLast().value);
//        System.out.println(linkedList.removeLast());

        linkedList.printList();

    }
}