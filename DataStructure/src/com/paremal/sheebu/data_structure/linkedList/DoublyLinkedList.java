package com.paremal.sheebu.data_structure.linkedList;

class Node_D {
	int data;
	Node_D next;
	Node_D previous;

	Node_D(int d) {
		this.data = d;
		this.next = null;
		this.previous = null;

	}

}

public class DoublyLinkedList {

	Node_D head;
	int length;

	public DoublyLinkedList() {
		// TODO Auto-generated constructor stub
		this.head = null;
		this.length = 0;
	}

	public void insertNode(int value) {

		Node_D newNode = new Node_D(value);
		if (head == null) {
			head = newNode;
		} else {
			newNode.next = head;
			head.previous = newNode;
			head = newNode;

		}
		this.length++;
	}

	public void insertNodeEnd(int value) {
		Node_D newNode = new Node_D(value);
		if (head == null) {
			this.head = newNode;
		} else {
			Node_D n = head;
			while (n.next != null) {
				n = n.next;
			}
			n.next = newNode;
			newNode.previous=n;
		}
		this.length++;
	}
}
