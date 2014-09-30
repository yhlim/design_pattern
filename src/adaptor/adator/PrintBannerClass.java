package adaptor.adator;

import adaptor.adpatee.Banner;
import adaptor.target.Print;

public class PrintBannerClass extends Banner implements Print {
	//상속받은 Banner의 메소드(showWithStrong, showWithWeak)을 사용하기 위해 super생성자 호출
    public PrintBannerClass(String string) {
        super(string);
    }
    
	@Override
	public void printWeak() {
		showWithParen();
	}

	@Override
	public void printStrong() {
		showWithAster();
	}

}
