package templatemethod.work.main;

import templatemethod.work.Designer;
import templatemethod.work.Developer;
import templatemethod.work.Worker;

public class WorkMain {

	public static void main(String[] args) {
		Worker developer = new Developer();
		developer.work();
		Worker designer = new Designer();
		designer.work();
	}

}
