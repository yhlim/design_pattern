package adaptor.adator;

import adaptor.adpatee.Banner;
import adaptor.target.PrintAbstract;

public class PrintBannerInstance extends PrintAbstract {
    //Adaptee인 Banner를 상속하지 않고 인스턴스를 생성하고 위임하기 위해 필드 선언
    private Banner banner;
    public PrintBannerInstance(String string) {
        //인스턴스를 생성
        this.banner = new Banner(string);
    }
    //필드를 경유하여 인스턴스의 메소드를 호출한다.
    public void printWeak() {
        banner.showWithParen();
    }
     
    public void printStrong() {
        banner.showWithAster();
    }
}
