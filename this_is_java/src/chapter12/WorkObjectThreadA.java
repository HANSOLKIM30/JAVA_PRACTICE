package chapter12;

public class WorkObjectThreadA extends Thread {

	private WorkObject workObject;
	
	public WorkObjectThreadA(WorkObject workObject) {
		this.workObject = workObject;
	}
	
	@Override
	public void run() {
		for(int i = 0; i < 10; i++) {
			workObject.methodA();
		}
	}
}
