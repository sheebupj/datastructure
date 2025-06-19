package com.paremal.sheebu.data_structure.linkedList;

import java.util.Objects;

class Node {
    Integer data;
    Node next;

    public Node(Integer data) {
        this.data = data;
    }
}


public class LinkedListRecursive {
    Node head;

    public LinkedListRecursive() {

    }

    void add(Integer data) {
        if (head == null) {
            head = addData(head, data);
        } else {
            addData(head, data);
        }

    }

    private Node addData(Node head, Integer data) {
        if (head == null) {
            head = new Node(data);
        } else head.next = addData(head.next, data);

        return head;
    }
    void insertAtPositon(Integer pos,Integer data){
        head= insertDataAtPosition(pos,data,head);
    }

    private Node insertDataAtPosition(Integer pos, Integer data, Node node3) {
        if(pos==1){
            Node tmp= node3;
            node3 =new Node(data);
            node3.next=tmp;
        }
        else if(node3.next!=null){
            node3.next=insertDataAtPosition(--pos,data, node3.next);
        }
        else{
            System.out.println("End of list encountered");

        }
        return node3;
    }


    void inOrder() {
        inOrderData(head);
        System.out.println();
    }

    private void inOrderData(Node head) {
        if (head != null) {
            System.out.print(head.data + "  ");
            inOrderData(head.next);
        }
    }
    void remove(Integer data){
        head=removeData(head,data);
    }

    private Node removeData(Node node3, Integer data) {
            if(Objects.equals(node3.data, data)){
                return node3.next;
            }
            else{
                node3.next=removeData(node3.next,data);
            }
            return node3;

    }


    public static void main(String[] args) {
        LinkedListRecursive list = new LinkedListRecursive();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);
        list.inOrder();
        list.remove(10);
        list.inOrder();
        list.remove(40);
         list.inOrder();
        list.remove(50);
        list.inOrder();
        list.insertAtPositon(1,110);
        list.inOrder();
        list.insertAtPositon(3,330);
        list.inOrder();
        list.add(550);
        list.insertAtPositon(5,660);
        list.inOrder();

    }
}

