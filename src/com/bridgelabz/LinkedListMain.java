package com.bridgelabz;

public class LinkedListMain {
    public static void main(String[] args) {
        System.out.println("Welcome to Linked List");
        LinkedList<Integer> node =new LinkedList();
//        node.push(70);
//        node.push(30);
//        node.push(56);
        node.append(56);
        node.append(30);
        node.append(70);
        node.display();
    }
}
