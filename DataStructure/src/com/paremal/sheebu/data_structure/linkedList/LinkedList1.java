package com.paremal.sheebu.data_structure.linkedList;

public class LinkedList1 {
    Node first;
    Node last;


    private static class Node {
        Integer data;
        Node next;

        Node(Integer data) {
            this.data = data;
            this.next = null;
        }

    }

    void add(Integer data) {
        Node newNode = new Node(data);

        if (first == null) {
            first = newNode;
            last = newNode;
        } else {
            Node current = first;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
            last=newNode;
        }
    }

    void insertAtBeginning(Integer data) {
        Node newNode = new Node(data);
        newNode.next = first;
        first = newNode;
    }
    void insertAt(Integer pos, Integer data) {
        Node newNode = new Node(data);

        if (first == null) {
            System.out.println("Empty linked list...Can not insert, aborting");
            return;
        }
        int count = 2;
        Node current = first;
        while (count < pos && current.next != null) {
            current = current.next;
            count++;
        }
        if (current.next != null) {
            Node temp = current.next;
            current.next = newNode;
            newNode.next = temp;
        } else {
            System.out.println("Insert position greater than LinkedList length , adding  data:"+data+ " at end of the LinkedList");
            add(data);
        }

    }
    void deleteFirstNode(){
        if(first==null){
            System.out.println("Empty linkedList Nothing to delete");
            return;
        }
        if(first.next!=null) {
            first = first.next;
        }
        else{
            first=null;
            last=null;
        }
    }
    void deleteAtPosition(Integer position){
        if(position==1){
            deleteFirstNode();
            return;
        }
        int count=1;
        Node current=first;
        while(count<position-1&&current.next!=null){
            current=current.next;
            count++;
        }
        current.next=current.next.next;
        if(current.next==null){
            last=current;
        }
    }


    void printNodes() {
        Node node = first;
        System.out.printf("\n[ ");
        while (node != null) {
            System.out.printf(node.data + " ");
            node = node.next;
        }
        System.out.printf("]");

    }
    public static void main(String[] args) {
        LinkedList1 linkedList1 = new LinkedList1();
        linkedList1.deleteFirstNode();
        linkedList1.insertAt(1,8);
        linkedList1.add(1);
        linkedList1.add(9);
        linkedList1.add(0);
        linkedList1.insertAtBeginning(100);
        linkedList1.insertAt(2, 2);
        linkedList1.insertAt(3, 3);
        linkedList1.insertAt(10, 6);
        linkedList1.printNodes();
        linkedList1.deleteFirstNode();
        linkedList1.printNodes();
        linkedList1.deleteAtPosition(1);
        linkedList1.printNodes();
        linkedList1.deleteAtPosition(5);
        linkedList1.printNodes();
    }
}
