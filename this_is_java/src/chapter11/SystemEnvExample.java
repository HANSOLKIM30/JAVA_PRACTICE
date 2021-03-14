package chapter11;

// JAVA_HOME 환경 변수 값 얻기
public class SystemEnvExample {

	public static void main(String[] args) {
		String javaHome = System.getenv("JAVA_HOME");
		System.out.println("JAVA_HOME: " + javaHome);
	}
}
