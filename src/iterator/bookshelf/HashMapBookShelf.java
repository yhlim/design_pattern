package iterator.bookshelf;

import iterator.common.Aggregate;
import iterator.common.Book;
import iterator.common.Iterator;

import java.util.HashMap;

public class HashMapBookShelf implements Aggregate {

	private HashMap<Integer, Book> bookList = new HashMap<Integer, Book>();
	private static int index = 0;

	public Book getBookAt(int index) {
		Book book = (Book) bookList.get(index);
		return book;
	}

	public void append(Book book) {
		this.bookList.put(index, book);
		index++;
	}

	public int getLength() {
		return bookList.size();
	}

	@Override
	public Iterator iterator() {
		return new HashMapBookShelfIterator(this);
	}

}
