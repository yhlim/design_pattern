package main;

import iterator.bookshelf.Book;
import iterator.bookshelf.HashMapBookShelf;
import iterator.common.Iterator;
import iterator.common.Person;
import iterator.generics.ArrayListGenerics;

/**
 * Iterater 패턴 
 * 내부를 노출하지 않고, 어떤 객체 집합에 속한 원소들을 순차적으로 접근할 수 있는 방법을 제공하는 패턴.
 * 실제 리스트를 구성하는 항목을 관리하기 위한 List 클래스와는 별도로 
 * List 클래스 객체 내의 항목들을 접근하기 위한 별도의 클래스를 정의해서 사용하는 방식
 * @author LYH
 *
 */
public class BookShelfMain {

	public static void main(String[] args) {

		HashMapBookShelf bookShelf = new HashMapBookShelf();
		//ArrayListBookShelf bookShelf = new ArrayListBookShelf();
		bookShelf.appendBook(new Book("프로그래밍 jQuery"));
		bookShelf.appendBook(new Book("Effective java"));
		bookShelf.appendBook(new Book("거꾸로 배우는 소프트웨어 개발"));
		bookShelf.appendBook(new Book("테스트 주도 개발 TDD"));
		bookShelf.appendBook(new Book("자바성능 튜닝 이야기"));
		Iterator iterator = bookShelf.iterator();

		while (iterator.hasNext()) {
			System.out.println("No." + iterator.index() + "" + ((Book) iterator.next()).getName());
		}
		System.out.println("");
		Book book = (Book) iterator.first();
		System.out.println("No." + iterator.index() + " : " + book.getName());
		
		System.out.println("====================================================");
		ArrayListGenerics<Book> bookShelf2 = new ArrayListGenerics<Book>();
		bookShelf2.append(new Book("프로그래밍 jQuery"));
		bookShelf2.append(new Book("Effective java"));
		bookShelf2.append(new Book("거꾸로 배우는 소프트웨어 개발"));
		bookShelf2.append(new Book("테스트 주도 개발 TDD"));
		bookShelf2.append(new Book("자바성능 튜닝 이야기"));
		
		Iterator iterator2 = bookShelf2.iterator();
		while (iterator2.hasNext()) {
			System.out.println("No." + iterator2.index() + "" + ((Book) iterator2.next()).getName());
		}
		
		System.out.println("====================================================");
		ArrayListGenerics<Person> personList = new ArrayListGenerics<Person>();
		personList.append(new Person("아이유", 22, "가수", "서울"));
		personList.append(new Person("수지", 21, "가수", "서울"));
			
		Iterator personIterator = personList.iterator();
		while (personIterator.hasNext()) {
			System.out.print("No." + personIterator.index());
			Person person = (Person) personIterator.next();
			System.out.println(" name : "+person.getName() + "age : "+ person.getAge());
		}
	}

}
