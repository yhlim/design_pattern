package iterator.bookshelf;

import iterator.common.Book;
import iterator.common.Iterator;

public class BookShelfIterator implements Iterator {
	
	private BookShelf bookShelf;
	private int index;
	
	public BookShelfIterator (BookShelf bookShelf) {
		this.bookShelf = bookShelf;
		this.index = 0;
	}
	
	@Override
	public boolean hasNext() {
		if (index < bookShelf.getLength()) {
			return true;
		} else {
			return false;
		}
	}
	
	@Override
	public Object next() {
		Book book = bookShelf.getBookAt(index);
		index++;
		return book;
	}
	
	@Override
	public int index() {
		return index;
	}
	
	@Override
	public Object first() {
		index = 0;
		Book book = bookShelf.getBookAt(index);
		return book;
	}
	
	@Override
	public Object last() {
		index = bookShelf.getLength() - 1;
		Book book = bookShelf.getBookAt(index);
		return book;
	}
	
}
