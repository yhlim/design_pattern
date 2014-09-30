package templatemethod.makebeverage.main;

import templatemethod.makebeverage.Beverage;
import templatemethod.makebeverage.Coffee;
import templatemethod.makebeverage.Tea;

public class MakeBeverageMain {

	public static void main(String[] args) {
		Beverage coffee = new Coffee("커피");
		coffee.processing();
		Beverage tea = new Tea("홍차");
		tea.processing();
	}

}

/**

ㅁ Template Method Pattern

- 상위 클래스에서 처리의 흐름을 제어하며, 하위 클래스에서 처리의 내용을 구체화 한다.
- 여러 클래스에 공통되는 사항은 상위 추상 클래스에서 구현하고, 각각 상세부분은 하위 클래스에서 구현한다.
- 코드의 중복을 줄이고, Refactoring에 유리한 패턴으로 상속을 통한 확장 개발 방법으로써
   전략 패턴(Strategy Pattern)과 함께 가장 많이 사용되는 패턴 중 하나이다.


ㅁ 고려사항

1. 멤버 함수들의 접근 범위 지정에 대한 명확화가 필요
2. 가상함수, 일반함수로 선언에 대한 결정이 필요
3. 재정의 함수(virtual)의 수를 줄이는 것이 필요(virtual table 확장에 따른 perfomance 문제점 발생)

**/