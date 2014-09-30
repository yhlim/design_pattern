package templatemethod;

public class StringDisplay extends AbstractDisplay {
	// StringDisplay도 AbstractDisplay의 하위 클래스
	private String string;						// 표시해야 할 문자열
	private int width;							// 바이트 단위로 계산한 문자열의 길이
	public StringDisplay(String string) {		// 생성자에서 전달된 문자열 string을
		this.string = string;						// 필드에 기억
		this.width = string.getBytes().length;	// 그리고 바이트 단위의 길이드 필드에 기억
	}
	
	@Override
	public void open() {						// 오버라이드해서 정의한 open 메소드
		printLine();									// 이 클래스의 메소드 printLine에서 선을 그리고 있다.
	}
	
	@Override
	public void print() {							// print 메소드는
		System.out.println("|" + string + "|");	//필드에 기억해 둔 문자열의 전후에 "|"을 붙여서 표시
	}
	
	@Override
	public void close() {						// close 메소드는
		printLine();									// open처럼 printLine 메소드에서 선을 그리고 있다.
	}
	
	private void printLine() {					// open과 close에서 호출된 printLine 메소드이다. (private이기 때문에 이 클래스 안에서만 사용)
		System.out.print("+");					// 테두리의 모서리를 표현하는 "+" 마크를 표시
		for (int i = 0; i < width; i++) {		// width개의 "-"를 표시하고
			System.out.print("-");				// 테두리 선으로 이용한다.
		}
		System.out.println("+");					// 테두리의 모서리를 표현하는 "+" 마크를 표시
	}
}
