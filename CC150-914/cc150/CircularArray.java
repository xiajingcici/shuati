package cc150;

import java.util.Iterator;

public class CircularArray<T>implements Iterable<T> {
	T[] items;
	private int head=0;
	//constructor
	public CircularArray(int size){
		items=(T[]) new Object[size];
	}
	public int convert(int index){
		if(index<0){
			index+=items.length;
		}
		return (head+index)%items.length;
	}
	public void rotate(int shiftRight){
		head=convert(shiftRight);
	}
	public T get(int i){
		if(i<0||i>=items.length){
			throw new java.lang.IndexOutOfBoundsException("...");
		}
		return items[convert(i)];
	}
	public void set(int i,T item){
		items[convert(i)]=item;
	}
	public static void main(String args[]){
		CircularArray<Integer> c=new CircularArray<Integer>(5);
		Integer[] items=new Integer[5];
		for(int i=0;i<items.length;i++){
			items[i]=i+1;
		}

	}
	@Override
	public Iterator<T> iterator() {
		return new CircularArrayIterator<T>(this);
	}

}
