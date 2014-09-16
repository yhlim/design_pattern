package iterator.generics;

import iterator.common.Iterator;

public class ArrayListGenericsIterator<T> implements Iterator {

	private ArrayListGenerics<T> arrayListGenerics;
	private int index;

	public ArrayListGenericsIterator(ArrayListGenerics<T> arrayListGenerics) {
		this.arrayListGenerics = arrayListGenerics;
		this.index = 0;
	}

	@Override
	public boolean hasNext() {
		if (index < arrayListGenerics.getLength()) {
			return true;
		} else {
			return false;
		}
	}

	@Override
	public Object next() {
		Object item = arrayListGenerics.get(index);
		index++;
		return item;
	}
	
	@Override
	public Object first() {
		index = 0;
		Object item = arrayListGenerics.get(index);
		return item;
	}
	
	@Override
	public int index() {
		return index;
	}

}
