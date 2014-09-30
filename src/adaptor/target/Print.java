package adaptor.target;

public interface Print {
	/**
	 * 강조를 약하게 하기 위한 인터페이스 메소드
	 */
	public abstract void printWeak(); 

	/**
	 * 강조를 강하게 하기 위한 인터페이스 메소드
	 */
	public abstract void printStrong(); 
}
