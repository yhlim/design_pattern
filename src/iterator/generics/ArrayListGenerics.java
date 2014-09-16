package iterator.generics;

import iterator.common.Aggregate;
import iterator.common.Iterator;

import java.util.ArrayList;

public class ArrayListGenerics<T> implements Aggregate {

	private ArrayList<T> arrayList = new ArrayList<T>();

	public T get(int index) {
		T item = (T) arrayList.get(index);
		return item;
	}

	public void append(T item ) {
		this.arrayList.add(item);
	}

	public int getLength() {
		return arrayList.size();
	}

	@Override
	public Iterator iterator() {
		return new ArrayListGenericsIterator<T>(this);
	}

}
