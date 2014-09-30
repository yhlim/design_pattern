package templatemethod.makebeverage;

public class Tea extends Beverage {
	private String tea;
	public Tea(String tea) {
		this.tea = tea;
	}
	
	@Override
	public void additives() {
		System.out.println("레몬을 넣는다.");
	}
	
	@Override
	public void make() {
		System.out.println(tea + "를 만든다.");
	}
}
