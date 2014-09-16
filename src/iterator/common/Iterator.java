package iterator.common;

/**
 * Iterater(반복자)의 역할 : 요소를 순서대로 검색해가는 인터페이스(API)를 결정하는 역할.
 *                           쉡게 리스트상의 현재 위치를 조정하는 역할이라고 생각하면된다.
 * 
 * @author LYH
 *
 */
public interface Iterator {
	/**
	 * 다음 요소가 존재하는지 여부를 확인
	 * @return
	 */
	public abstract boolean hasNext();
	 
	/**
	 * 다음 요소를 리턴
	 * @return
	 */
	public abstract Object next();
	
}
