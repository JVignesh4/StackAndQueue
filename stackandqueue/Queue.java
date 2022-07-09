package com.bridgelabz.stackandqueue;

import com.blz.linkedlist.INode;
import com.blz.linkedlist.LinkList;
import com.blz.linkedlist.MyNode;

public class Queue<K> {

    private final LinkList queueLinkedList = new LinkList();

    public void enqueue(INode element) {
        queueLinkedList.append((MyNode) element);
    }


    public void printQueue() {
        queueLinkedList.display();
    }
}
