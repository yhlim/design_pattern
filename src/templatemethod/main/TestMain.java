package templatemethod.main;

import templatemethod.AbstractDisplay;
import templatemethod.CharDisplay;
import templatemethod.StringDisplay;

public class TestMain {

	public static void main(String[] args) {
		// 'H'를 가진 CharDisplay 인스턴스를 1개 만든다.
		AbstractDisplay d1 = new CharDisplay('H');
		// "Hello, world."를 가진 StringDisplay의 인스턴스를 1개 만든다.
		AbstractDisplay d2 = new StringDisplay("Hello, world.");
		// "안녕하세요."를 가진 StringDisplay의 인스턴스를 1개 만든다.
		AbstractDisplay d3 = new StringDisplay("안녕하세요.");
		d1.display();		// d1, d2, d3 모두 같은 AbstractDisplay의 하위 클래스의 인스턴스이기 때문에
		d2.display();		// 상속한 display 메소드를 호출할 수 있다.
		d3.display();		// 실제 동작은 CharDisplay나 StringDisplay에서 결정한다.
	}

}

/**
ㅁ Template Method 패턴

1. 로직을 공통화 할 수 있다.
  템플릿 메소드에 오류가 발견되더라도 템플릿 메소드만 수정하면 된다는 이점이 있다.
  
2. 상위 클래스와 하위 클래스의 연계
  상위 클래스에서 선언된 추상 메소드를 실제로 하위 클래스에서 구현할 때에는
  어느 타이밍에서 호출되는지 이해해야 한다.
  상위 클래스의 소스 프로그램이 없으면 하위 클래스의 구현이 어려울 수도 있다.

**/