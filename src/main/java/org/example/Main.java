package org.example;

import org.example.LinkedList.LinkedList;
import org.example.Queues.Queues;
import org.example.Stacks.Stack;

public class Main {
    public static void main(String[] args) {

        //LinkedList

//        LinkedList linkedList = new LinkedList(1);
//        linkedList.append(2);
//        linkedList.append(3);
//        linkedList.append(4);
//
//        System.out.println(linkedList.findKthFromEnd(2).value);


       // linkedList.insert(1,5);

      //  System.out.println(linkedList.get(1).value);


//        System.out.println(linkedList.removeLast().value);
//        System.out.println(linkedList.removeLast().value);
//        System.out.println(linkedList.removeLast().value);
//        System.out.println(linkedList.removeLast());

//        linkedList.printList();


        //Stacks

//        Stack myStack = new Stack(4);
//        myStack.getTop();
//        myStack.getHeight();
//
//        myStack.push(6);
//        myStack.push(7);
//        myStack.push(8);
//
//        myStack.pop();
//
//
//        myStack.printStack();

        //Queues

        Queues myQueue = new Queues(6);
        myQueue.getFirst();
        myQueue.getLast();
        myQueue.getLength();

        myQueue.enqueue(5);
        myQueue.enqueue(7);
        myQueue.enqueue(8);

        myQueue.printQueue();

    }
}