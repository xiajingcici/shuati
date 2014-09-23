package cc150;

import java.util.Iterator;

public class CircularArrayIterator<TI> implements Iterator<TI> {
	private int _cur=-1;
	private TI[] _items;
	public CircularArrayIterator(CircularArray<TI> array) {
		_items=array.items;
	}
	

	@Override
	public boolean hasNext() {
		// TODO Auto-generated method stub
		return _cur< _items.length-1;
	}

	@Override
	public TI next() {
		// TODO Auto-generated method stub
		_cur++;
		TI item=(TI) _items[convert(_cur)];
		return item;
	}
	public int convert(int index){
		if(index<0){
			index+=_items.length;
		}
		return (_cur+index)%_items.length;
	}


	@Override
	public void remove() {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException("...");
	}

}
