package com.paremal.sheebu.data_structure.linkedList;

class Node {
	int data;
	Node link;

	public Node(int data) {
		super();
		this.data = data;
		this.link = null;
	}

}

public class SingleEndedLinkedList {

	private Node start;
	private int length;

	public SingleEndedLinkedList() {
		super();
		// TODO Auto-generated constructor stub
		this.start = null;
		this.length = 0;
	}

	public void insertItem(int dta) {

		Node newNode = new Node(dta);
		if (start == null) {
			start = newNode;
		} else {
			newNode.link = start;
			start = newNode;
		}

		length++;

	}

	public void insertEnd(int data) {
		Node newNode = new Node(data);
		if (start == null) {
			start = newNode;

		} else {
			Node n = start;
			while (n.link != null) {
				n = n.link;
			}

			n.link = newNode;

		}
		length++;
	}

	public void insertAtPos(int data, int pos) {
		if (pos < 0) {
			System.out.println("invalid position");
			return;
		}
		if (pos == 1) {
			insertItem(data);
		} else if (pos > length) {
			insertEnd(data);
		} else {
			Node n = start;
			int i = 1;
			while (n.link != null) {
				i++;
				if (i == pos) {
					break;
				}
				n = n.link;
			}
			Node newNode = new Node(data);
			newNode.link = n.link;
			n.link = newNode;

		}
	}

}
