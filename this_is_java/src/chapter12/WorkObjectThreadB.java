package chapter12;

public class WorkObjectThreadB extends Thread{

	private WorkObject workObject;
	
	public WorkObjectThreadB(WorkObject workObject) {
		this.workObject = workObject;
	}
	
	@Override
	public void run() {
		for(int i = 0; i < 10; i++) {
			workObject.methodB();
		}
	}
}
