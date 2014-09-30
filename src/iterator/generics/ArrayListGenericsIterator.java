package iterator.generics;

import iterator.common.Book;
import iterator.common.Iterator;

/**
 * ConcreteIterator(구체적인 반복자)의 역할 : 
 *  Iterator가 결정한 인터페이스(API)를 실제로 구현하는 역할. 
 *  일반적으로 상속과 구현의 관계에 있어서 상속을 받는 자식이 부모가 결정해 놓은 인터페이스를 구현하고 
 *  사용하기 위해서는 인터페이스에 필요한 정보들을 가지고 있어야 한다. 
 *  따라서 Iterator를 구현하는 ConcreteIterator는 검색하기 위해 필요한 정보를 가지고 있어야 한다.
 *                                            
 * @author LYH
 *
 * @param <T>;
 */
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
	public int index() {
		return index;
	}
	
	@Override
	public Object first() {
		index = 0;
		Object item = arrayListGenerics.get(index);
		return item;
	}
	
	@Override
	public Object last() {
		index = arrayListGenerics.getLength() - 1;
		Object item = arrayListGenerics.get(index);
		return item;
	}

}
