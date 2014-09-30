package adaptor.main;

import adaptor.adator.PrintBannerClass;
import adaptor.target.Print;

public class testMan {

	public static void main(String[] args) {
		Print p = new PrintBannerClass("test");
		p.printStrong();
		p.printWeak();

	}

}
