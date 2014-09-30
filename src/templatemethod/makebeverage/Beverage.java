package templatemethod.makebeverage;

public abstract class Beverage {
	abstract void additives();				// 첨가물을 추가한다.
	abstract void make();					// 음료를 만든다.
	
	private void boil() {					// 물을 끓인다.
		System.out.println("물을 끓인다.");
	}
	
	public void put() {						// 컵에 따른다.
		System.out.println("컵에 따른다.");
		System.out.println("==================");
	}
	
	public final void processing() {		// 음료를 만드는 프로세스
		boil();			// 물을 끓인다.
		additives();		// 첨가물을 추가한다.
		make();			// 음료를 만든다.
		put();			// 컵에 따른다.
	}
}
