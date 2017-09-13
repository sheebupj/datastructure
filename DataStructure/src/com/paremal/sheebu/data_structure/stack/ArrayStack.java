package com.paremal.sheebu.data_structure.stack;

public class ArrayStack<E> implements Stack<E> {
	
	public static final int CAPACITY=1000;
	private E[] data;
	private int t=-1;
	
	

	public ArrayStack() {
	
		this(CAPACITY);
	}
	

	public ArrayStack(int capacity) {
		super();
		data=(E[]) new Object[capacity];
	}


	@Override
	public int size() {
		// TODO Auto-generated method stub
		return t+1;
	}

	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return (t==-1);
	}



	@Override
	public E top() {
		// TODO Auto-generated method stub
		if(isEmpty())return null;
		
		return data[t];
	}
	@Override
	public void push(E e)throws IllegalStateException  {
		// TODO Auto-generated method stub
		if(data.length== CAPACITY){
			throw new IllegalStateException("stack is full");
		}
		data[++t]=e;

	}

	@Override
	public E pop() {
		// TODO Auto-generated method stub
		if(isEmpty()){
			return null;
		}
		E e=data[t];
		data[t]=null;
		return e;
	}

}
