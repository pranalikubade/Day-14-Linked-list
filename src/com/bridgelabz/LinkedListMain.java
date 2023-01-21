package com.bridgelabz;

public class LinkedListMain {
    public static void main(String[] args) {
        System.out.println("Welcome to Linked List");
        LinkedList<Integer> node =new LinkedList();
        node.push(70);
        node.push(30);
        node.push(56);
        node.display();
//        node.append(56);
//        node.append(30);
//        node.append(70);

        System.out.println();
        System.out.println("After pop...");
        Integer poppedElement = node.pop();
        if(poppedElement == null)
            System.out.println("Linked List Empty");
        else
            System.out.println("Popped Element " + poppedElement);
        node.display();
    }
}
