package adaptor.adpatee;
/**
 * Adaptee(개조되는 쪽)
 * 
 * @author LYH
 *
 */
public class Banner {
	private String string;

	// Banner 생성자
	public Banner(String string) {
		this.string = string;
	}

	// (문자열)의 형태로 출력
	public void showWithParen() {
		System.out.println("(" + string + ")");
	}

	// *문자열*의 형태로 출력
	public void showWithAster() {
		System.out.println("*" + string + "*");
	}
}
