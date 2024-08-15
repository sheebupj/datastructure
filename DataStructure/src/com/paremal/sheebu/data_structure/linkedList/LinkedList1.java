package com.paremal.sheebu.data_structure.linkedList;

public class LinkedList1 {
    Node first;
    Node last;

    public static void main(String[] args) {
        LinkedList1 linkedList1= new LinkedList1();
        linkedList1.add(4);
        linkedList1.add(7);
        linkedList1.add(2);
        linkedList1.printNodes();
    }
    private static class Node{
        Integer data;
        Node next;

        Node(Integer data){
            this.data=data;
            this.next=null;
        }

    }
    void add(Integer data){
        Node newNode=new Node(data);

        if (first==null){
            first=newNode;
            last=newNode;
        }
        else {
            Node f = first;
            while (f.next != null) {
                f = f.next;
            }
            f.next = newNode;
            last = newNode;
        }
    }
    void printNodes(){
        Node node =first;
        System.out.printf("[ ");
        while(node!=null){
            System.out.printf(node.data +" ");
            node=node.next;
        }
        System.out.printf("]");

    }
}
