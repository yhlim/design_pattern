package iterator.bookshelf;

import iterator.common.Aggregate;
import iterator.common.Book;
import iterator.common.Iterator;

public class BookShelf implements Aggregate {
	private Book[] books;
	private int last = 0;
	
	public BookShelf(int maxsize) {
		this.books = new Book[maxsize];
	}
	public Book getBookAt(int index) {
		return books[index];
	}
	
	public void append(Book book) {
		this.books[last] = book;
		last++;
	}
	
	public int getLength() {
		return last;
	}
	
	public Iterator iterator() {
		return new BookShelfIterator(this);
	}
}