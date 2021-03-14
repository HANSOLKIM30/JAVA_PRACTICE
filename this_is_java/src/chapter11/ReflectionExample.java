package chapter11;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

// 동적으로 클래스 멤버 정보 얻기
public class ReflectionExample {

	public static void main(String[] args) {
		
		try {
			Class clazz = Class.forName("chapter11.Car");
			
			System.out.println("[클래스 이름]");
			System.out.println(clazz.getName());
			System.out.println();
			
			System.out.println("[생성자 정보]");
			// 생성자 이름과 매개 변수 정보를 출력
			Constructor[] construnctors = clazz.getDeclaredConstructors();
			for(Constructor constructor : construnctors) {
				System.out.print(constructor.getName() + "(");
				Class[] parameters = constructor.getParameterTypes();
				printParameters(parameters);
				System.out.println(")");
			}
			
			System.out.println();
			
			/* 
			 * getDeclaredField, getDeclaredMethod: 선언된 필드와 메소드만 가져오고, 상속된 멤버는 가져오지 않는다. 
			 * 상속된 멤버까지도 얻고 싶다면 getField, getMethod 사용. 
			 * ★ 단, 해당 메소드는 public 멤버만 가져온다.			 
			 */
			System.out.println("[필드 정보]");
			// 필드 타입과 이름을 출력
			Field[] fields = clazz.getDeclaredFields();
			for(Field field : fields){
				System.out.print(field.getName() + "(");
				System.out.print(field.getType().getSimpleName() + " " + field.getName());
				System.out.println(")");
			}
			
			System.out.println();
			
			System.out.println("[메소드 정보]");
			// 메소드 이름과 매개 변수 정보를 출력
			Method[] methods = clazz.getDeclaredMethods();
			for(Method method : methods) {
				System.out.print(method.getName() + "(");
				Class[] parameters = method.getParameterTypes();
				printParameters(parameters);
				System.out.println(")");
			}
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	// 매개 변수 정보를 출력하는 공통 코드
	private static void printParameters(Class[] parameters) {
		for(int i = 0; i < parameters.length; i++) {
			System.out.print(parameters[i].getName());
			if(i<parameters.length-1) {
				System.out.print(",");
			}
		}
	}
}
