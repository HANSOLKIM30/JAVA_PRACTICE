package chapter11;

// 동적 객체 생성 및 실행
public class NewInstanceExample {

	public static void main(String[] args) {
		
		try {
			Class clazz = Class.forName("chapter11.SendAction");
			// Class clazz = Class.forName("chapter11.ReceieveAction");
			Action action = (Action) clazz.newInstance();
			action.execute();
			/*
			* newInstance 생성자는 기본 생성자를 이용하여 객체 생성.
			* 만약 기본생성자를 사용하고 싶지 않다면, 리플렉션으로 Constructor 객체를 얻어 newInstance 메소드를 호출하면 된다. 
			*/
		} catch(ClassNotFoundException | InstantiationException | IllegalAccessException e) {
			/* 
			 * InstantiationException → 추상클래스거나, 인터페이스로 객체를 생성할 수 없을 때 생기는 오류.
			 * IllegalAccessExcetpion → 클래스나 생성자가 접근제한자로 인해 접근할 수 없는 경우 발생. 
			 */
			e.printStackTrace();
		}	
	}
}
