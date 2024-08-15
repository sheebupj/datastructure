package com.paremal.sheebu.data_structure.linkedList;

public class LinkedList1 {
    Node first;
    Node last;


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
           Node current=first;
            while (current.next!=null){
                current=current.next;
            }
            current.next=newNode;
        }
    }
    public static void main(String[] args) {
        LinkedList1 linkedList1= new LinkedList1();
        linkedList1.add(1);
        linkedList1.add(9);
        linkedList1.add(0);
        linkedList1.insertAt(2,2);
        linkedList1.insertAt(3,3);
        linkedList1.insertAt(6,6);
        linkedList1.printNodes();
    }
    void insertAt(Integer pos,Integer data){
        Node newNode=new Node(data);

        if(first==null){
            System.out.println("empty linked list");
        }
        int count=2;
        Node current=first;
        while(count<pos&&current.next!=null ){
            current=current.next;
            count++;
        }
        if(current.next!=null) {
            Node temp = current.next;
            current.next = newNode;
            newNode.next = temp;
        }
        else{
            System.out.println("end of the linked list reached , adding  data at end of the list");
            add(data);
        }


        System.out.println();
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
