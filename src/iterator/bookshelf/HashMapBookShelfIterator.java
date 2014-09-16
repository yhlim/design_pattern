package iterator.bookshelf;

import iterator.common.Iterator;

public class HashMapBookShelfIterator implements Iterator {

	private HashMapBookShelf hashMapBookShelf;
	private int index = 0;

	public HashMapBookShelfIterator(HashMapBookShelf hashMapBookShelf) {
		this.hashMapBookShelf = hashMapBookShelf;

	}

	@Override
	public boolean hasNext() {
		if (index < hashMapBookShelf.getLength()) {
			return true;
		} else {
			return false;
		}
	}

	@Override
	public Object next() {
		Book book = hashMapBookShelf.getBookAt(index);
		index++;
		return book;
	}
	
	@Override
	public Object first() {
		index = 0;
		Book book = hashMapBookShelf.getBookAt(index);
		return book;
	}
	
	@Override
	public int index() {
		return index;
	}
}
