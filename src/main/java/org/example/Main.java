package org.example;

import org.example.HashTable.HashTable;
import org.example.LinkedList.LinkedList;
import org.example.Queues.Queues;
import org.example.Stacks.Stack;
import org.example.Trees.BinarySearchTrees;

public class Main {
    public static void main(String[] args) {


        //HashTable

        HashTable myHash = new HashTable();

        myHash.set("nails", 100);
        myHash.set("tile", 50);
        myHash.set("lumber", 80);

        System.out.println(myHash.get("lumber"));
        System.out.println(myHash.get("bolts"));




      //  myHash.printTable();

        //BST

//        BinarySearchTrees myTree = new BinarySearchTrees();
//
//        myTree.insert(47);
//        myTree.insert(21);
//        myTree.insert(76);
//        myTree.insert(18);
//        myTree.insert(52);
//        myTree.insert(82);
//
//        myTree.insert(27);
//
//        System.out.println(myTree.contains(27));
//
//        System.out.println(myTree.contains(17));
//
//
//        System.out.println(myTree.root.left.right.value);






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

//        Queues myQueue = new Queues(6);
//        myQueue.getFirst();
//        myQueue.getLast();
//        myQueue.getLength();
//
//        myQueue.enqueue(5);
//        myQueue.enqueue(7);
//        myQueue.enqueue(8);
//
//        myQueue.printQueue();


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


    }
}