package com.bridgelabz.stackandqueue;

import com.blz.linkedlist.INode;
import com.blz.linkedlist.LinkList;
import com.blz.linkedlist.MyNode;

public class Stack<K> {
    private final LinkList stackLinkedList;

    public Stack() {
        stackLinkedList = new LinkList();
    }


    public void push(INode element) {
        stackLinkedList.addNode((MyNode) element);
    }


    public void printStack() {
        stackLinkedList.display();
    }

}
