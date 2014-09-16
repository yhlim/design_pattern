package iterator.common;

import iterator.common.Iterator;

/**
 * Aggregate(집합체)의 역할 : Iterator 역할을 만들어내는 인터페이스(API)를 결정한다. 
 *                            순서대로 검색해주는 인터페이스를 가진 Iterator(반복자)를 고용하는 인터페이스
 * @author LYH
 *
 */
public interface Aggregate {
	public abstract Iterator iterator();
}
