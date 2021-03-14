package chapter11;

// Class 클래스: 클래스, 인터페이스의 메타데이터(명칭, 필드, 메소드, 생성자)를 관리.
// getClass와 forName() 예제
public class ClassExample {
	
	public static void main(String[] args) {
		
		Car car = new Car();
		Class clazz1 = car.getClass();	// 객체를 생성했을 때만 사용 가능한 getClass();
		System.out.println(clazz1.getName());
		System.out.println(clazz1.getSimpleName());
		System.out.println(clazz1.getName());
		System.out.println(clazz1.getPackage().getName());
		
		// 정적 메소드인 forName을 통해 클래스 객체 생성 가능
		try {
			Class clazz2 = Class.forName("chapter11.Car");
			System.out.println(clazz2.getSimpleName());
			System.out.println(clazz2.getName());
			System.out.println(clazz2.getPackage().getName());
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
