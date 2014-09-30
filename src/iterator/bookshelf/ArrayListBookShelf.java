package iterator.bookshelf;

import iterator.common.Aggregate;
import iterator.common.Book;
import iterator.common.Iterator;

import java.util.ArrayList;

public class ArrayListBookShelf implements Aggregate {

	private ArrayList<Book> bookList = new ArrayList<Book>();

	public Book getBookAt(int index) {
		Book book = (Book) bookList.get(index);

		return book;
	}

	public void append(Book book) {
		this.bookList.add(book);
	}

	public int getLength() {
		return bookList.size();
	}

	@Override
	public Iterator iterator() {
		return new ArrayListBookShelfIterator(this);
	}

}
