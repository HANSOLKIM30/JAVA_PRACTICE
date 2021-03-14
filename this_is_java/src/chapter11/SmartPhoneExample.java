package chapter11;

public class SmartPhoneExample {

	public static void main(String[] args) {
		SmartPhone myPhone = new SmartPhone("구글", "안드로이드");
		
		String strObj = myPhone.toString();
		System.out.println(strObj);
		/*System.out.println(매개값):
		 * 매개값이 기본타입일 경우 → 그대로 출력
		 * 매개값이 객체일 경우 → 해당 객체의 toString 메소드 호출하여 출력
		 */
		System.out.println(myPhone);
	}
}
