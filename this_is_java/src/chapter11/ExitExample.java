package chapter11;

// exit 메소드
public class ExitExample {

	/* 
	 * JVM에서 돌아가는 자바이지만 System 클래스를 통해 일정 부분 운영체제에 접근가능하다. 
	 * System 클래스의 모든 필드와 메소드는 static이다. 
	 */
	public static void main(String[] args) {
		// 보안 관리자 설정: SecurityManager의 익명 객체 생성
		System.setSecurityManager(new SecurityManager() {
			
			// exit 메소드를 실행하면 보안관리자(SecurityManager)의 checkExit 메소드가 자동실행됨.
			@Override
			public void checkExit(int status) {
				
				if(status != 5) {
					throw new SecurityException();
				}
			}		
		});
		
		for(int i = 0; i < 10; i++) {
			System.out.println(i);
			try {
				System.exit(i);
			} catch(SecurityException e) {
				
			}
			
		}
		
	}
}
