package com.bridgelabz.stackandqueue;

import com.blz.linkedlist.MyNode;

public class StackMain {
    public static void main(String[] args) {
        System.out.println("----- Welcome To Data Structure : Stack -----");

        Stack stackList = new Stack();
        MyNode<Integer> firstNode = new MyNode<Integer>(70);
        MyNode<Integer> secondNode = new MyNode<Integer>(30);
        MyNode<Integer> thirdNode = new MyNode<Integer>(56);
        stackList.push(firstNode);
        stackList.push(secondNode);
        stackList.push(thirdNode);
        stackList.printStack();

    }

}
