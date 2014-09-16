package iterator.bookshelf;

import iterator.common.Iterator;

public class ArrayListBookShelfIterator implements Iterator {

	private ArrayListBookShelf arrayListBookShelf;
	private int index;

	public ArrayListBookShelfIterator(ArrayListBookShelf arrayListBookShelf) {
		this.arrayListBookShelf = arrayListBookShelf;
		this.index = 0;
	}

	@Override
	public boolean hasNext() {

		if (index < arrayListBookShelf.getLength()) {
			return true;
		} else {
			return false;
		}
	}

	@Override
	public Object next() {
		Book book = arrayListBookShelf.getBookAt(index);
		index++;
		return book;
	}
	
	@Override
	public Object first() {
		index = 0;
		Book book = arrayListBookShelf.getBookAt(index);
		return book;
	}
	
	@Override
	public int index() {
		return index;
	}

}
