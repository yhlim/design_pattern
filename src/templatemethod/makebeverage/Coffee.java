package templatemethod.makebeverage;

public class Coffee extends Beverage {
	private String coffee;
	public Coffee(String coffee) {
		this.coffee = coffee;
	}
	
	@Override
	public void additives() {
		System.out.println("설탕, 프림을 넣는다.");
	}
	
	@Override
	public void make() {
		System.out.println(coffee + "를 만든다.");
	}
}
