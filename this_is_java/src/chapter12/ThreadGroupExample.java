package chapter12;
// 스레드 그룹을 이용한 일괄 종료 예제
public class ThreadGroupExample {

	public static void main(String[] args) {
		/*
		 *  ThreadGroup 객체를 생성하여 스레드 그룹을 생성.
		 *  1. ThreadGroup threadGroup = new ThreadGroup(String name) → 부모 스레드를 지정하지 않았으므로, 생성 시의 스레드가 속한 그룹의 하위 그룹으로 생성됨.
		 *  2. ThreadGroup threadGroup = new ThreadGroup(ThreadGroup parent, String name) → 부모 스레드의 하위 스레드 그룹으로 생성됨.
		 */
		ThreadGroup myGroup = new ThreadGroup("myGroup");	// 생성 시의 스레드가 속한 그룹의 하위 그룹으로 생성됨.
		// myGroup 스레드 그룹에 두 스레드를 포함시킴.
		GroupWorkThread workThreadA = new GroupWorkThread(myGroup, "workThreadA");
		GroupWorkThread workThreadB = new GroupWorkThread(myGroup, "workThreadB");
		
		workThreadA.start();
		workThreadB.start();
		
		System.out.println("[ main 스레드 그룹의 list() 메소드 출력 내용 ]");
		/*
		 * 현재 스레드가 속한 스레드 그룹의 이름을 얻고 싶을 때 사용
		 * Thread.getAllStrackTrace: 현재 프로세스에서 실행하는 모든 스레드에 대한 정보를 얻을 수 있음.
		 */
		ThreadGroup mainGroup = Thread.currentThread().getThreadGroup();
		// 현재 스레드 그룹의 이름, 최대 우선순위, 현재 스레드 그룹의 스레드와 하위 스레드 그룹의 내용까지 출력.
		mainGroup.list();
		System.out.println();
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println("[ myGroup 스레드 그룹의 interrupt 호출 ]");
		myGroup.interrupt();
	}
}
