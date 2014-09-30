package iterator.generics;

import iterator.common.Aggregate;
import iterator.common.Iterator;

import java.util.ArrayList;

/**
 * ConcreteAggregate(구체적인 집합체)의 역할 : 
 *  구체적인 Iterator 역할. 
 *  Aggregate(집합체) 역할이 결정한 인터페이스(API)를 실제로 구현하는 일을 한다.  
 *  즉, ConcreteIterator 역할의 인스턴스를 만들어 낸다.
 * 
 * @author LYH
 *
 * @param <T>
 */
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
