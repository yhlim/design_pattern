package iterator.main;

import iterator.common.Book;
import iterator.common.Iterator;
import iterator.common.Person;
import iterator.generics.ArrayListGenerics;

/**
 * Iterater 패턴 
 * 내부를 노출하지 않고, 어떤 객체 집합에 속한 원소들을 순차적으로 접근할 수 있는 방법을 제공하는 패턴.
 * 실제 리스트를 구성하는 항목을 관리하기 위한 List 클래스와는 별도로 
 * List 클래스 객체 내의 항목들을 접근하기 위한 별도의 클래스를 정의해서 사용하는 방식
 * 
 * ◇ Iterater 패턴 클래스 다이어그램
 * ----------------------                              ----------------------  
 * |    <<interface>>   |            Creates ▶        |    <<interface>>   |
 * |      Aggregate     | ---------------------------->|       Iterator     |
 * ----------------------                              ----------------------
 * | iterator           |                              | hasNext            |
 * ----------------------                              | next               |
 *          A                                          ----------------------
 *          |                                                    A                                                  
 *          |                                                    | 
 * ----------------------                              ----------------------
 * | ConcreateAggregate |                              | ConcreateIterator  |                              
 * ----------------------                              ----------------------
 * | iterator           |<---------------------------◇| aggreate           |
 * ----------------------                              ----------------------
 *                                                     | hasNext            |
 *                                                     | next               |
 *                                                     ----------------------
 * 
 * Iterater(반복자)의 역할 : 요소를 순서대로 검색해가는 인터페이스(API)를 결정하는 역할.
 *                          (hasNext 메소드는 다음 요소가 존재하는지 여부를 확인하는 내용을 구현하기 위한 추상 메소드이며, 
 *                           next는 다음 요소를 리턴 해주는 내용을 구현하기 위한 추상 메소드이다.)
 *
 * ConcreteIterator(구체적인 반복자)의 역할 : Iterator가 결정한 인터페이스(API)를 실제로 구현하는 역할. 
 *                                            일반적으로 상속과 구현의 관계에 있어서 상속을 받는 자식이 부모가 결정해 놓은 인터페이스를 구현하고 
 *                                            사용하기 위해서는 인터페이스에 필요한 정보들을 가지고 있어야 한다. 
 *                                            따라서 Iterator를 구현하는 ConcreteIterator는 검색하기 위해 필요한 정보를 가지고 있어야 한다.
 *
 * Aggregate(집합체)의 역할 : Iterator 역할을 만들어내는 인터페이스(API)를 결정한다. 
 *                            집합체가 가진 인터페이스는 '내가 가지고 있는 요소를 순서대로 검색해 주는 사람'을 만들어내는 메소드다. 
 *                            한마디로 순서대로 검색해주는 인터페이스를 가진 Iterator(반복자)를 고용하는 인터페이스를 가진 역할이라고 생각하면 된다.
 *                            Iterator는 오브젝트의 요소를 순서대로 검색해가는 인터페이스를 결정하게되고 Aggregate는 Iterator역활을 만들어내는 인터페이스를 결정하는것같다.
 *                            즉 Aggregate에서 Interator 생성자를 선언하게되는데 이때 Iterrater에 검색할 데이터 오브젝트를 넘기게 된다
 *                            
 * ConcreteAggregate(구체적인 집합체)의 역할 : 구체적인 Iterator 역할. 
 *                                             Aggregate(집합체) 역할이 결정한 인터페이스(API)를 실제로 구현하는 일을 한다.  
 *                                             즉, ConcreteIterator 역할의 인스턴스를 만들어 낸다.
 *                                             
 *                                             
 *                                             
 *  그럼 왜 for문으로 돌리지 않고 이렇게 번거롭게 Iterator와 Aggregate라는 인터페이스를 사용하는걸까?
 *  
 *   만약 BookShelf클래스에서 Book[] 배열로 처리했던 코드를 Vector나 ArrayList로 변경하는경우 개발자는 배열처리에 해당하는 
 *   Main의 코드를 Vector나 ArrayList에 맞게 다시 수정해야한다.
 *   
 *   하지만 Iterator 패턴을 사용한다면 Main의 소스는 전혀 수정할 필요가 없다.
 *   즉, Main코드와 BookShelf 사이에 Iterater 인터페이스가 있음으로 서로가 의존하지 않게된다는것이다.
 *   
 *   BookShelfIterator에는 BookShelf가 제공하는 getLength()나 getBookAt(int index)와 같은 메소드를 사용하여 hasNext()와 Next()를 구현하였고 
 *   Main에선 BookShelfIterator에서 구현된 메소드만을 사용하였기때문에
 *   BookShelf에서 어떤 수정이 있더라도 getLength()나 getBookAt(int index) 이 두 메소드의 리턴값만 동일하게 주면 이상없이 그대로 실행된다는것이다.                                           
 *                                                 
 * @author LYH
 *
 */
public class IteratorTestMain {

	public static void main(String[] args) {
		
		// 컬렉션 구현 방법을 노출시키지 않으면서 그 집합체 안에 들어있는 모든 항목을 순차적으로 접근 할 수 있는 방법을 제공한다.
		// 두 컬렉션을 검색하는 메서드를 캡슐화 하여 이터레이터(Iterator) 인터페이스를 통해서 두 컬렉션을 같은 방식으로 반복시킬 수 있습니다.
		// 쉽게 배열 / 리스트 / 해시테이블을 물론 어떤 종류의 객체 컬렉션에 대해서도 반복자를 구현 할 수 있습니다.
		
		//BookShelf bookShelf = new BookShelf(5);
		//HashMapBookShelf bookShelf = new HashMapBookShelf();
		///ArrayListBookShelf bookShelf = new ArrayListBookShelf();
		ArrayListGenerics<Book> bookShelf= new ArrayListGenerics<Book>();
		bookShelf.append(new Book("프로그래밍 jQuery"));
		bookShelf.append(new Book("Effective java"));
		bookShelf.append(new Book("거꾸로 배우는 소프트웨어 개발"));
		bookShelf.append(new Book("테스트 주도 개발 TDD"));
		bookShelf.append(new Book("자바성능 튜닝 이야기"));
		Iterator iterator = bookShelf.iterator();

		while (iterator.hasNext()) {
			System.out.println("No." + iterator.index() + " " + ((Book) iterator.next()).getName());
		}
		System.out.println("");
		Book book = (Book) iterator.first();
		System.out.println("No." + iterator.index() + " : " + book.getName());
		book = (Book) iterator.last();
		System.out.println("No." + iterator.index() + " : " + book.getName());
		
		/*
		System.out.println("====================================================");
		ArrayListGenerics<Book> bookShelfList= new ArrayListGenerics<Book>();
		bookShelfList.append(new Book("프로그래밍 jQuery"));
		bookShelfList.append(new Book("Effective java"));
		bookShelfList.append(new Book("거꾸로 배우는 소프트웨어 개발"));
		bookShelfList.append(new Book("테스트 주도 개발 TDD"));
		
		Iterator iterator2 = bookShelfList.iterator();
		while (iterator2.hasNext()) {
			book = (Book) iterator2.next();
			System.out.println("name : " + book.getName());
		}*/
		
		System.out.println("====================================================");
		ArrayListGenerics<Person> personList = new ArrayListGenerics<Person>();
		personList.append(new Person("아이유", 22, "가수", "서울"));
		personList.append(new Person("수지", 21, "가수", "서울"));
			
		Iterator personIterator = personList.iterator();
		while (personIterator.hasNext()) {
			Person person = (Person) personIterator.next();
			System.out.println("name : "+person.getName() + "age : "+ person.getAge());
		}
	}

}
