package chapter11;

// Thin Clone: clone() 메소드를 이용한 필드 및 참고객체의 주소값 복사
public class ThinCloneMember implements Cloneable{	// 반드시 Cloneable 인터페이스 구현 명시해야 clone 객체 사용 가능.

	/*
	 * clone 메소드를 사용하기 위해서는 java.lang.Cloneable 인터페이스를 구현하는 것을 반드시 명시해야한다. 
	 * 원본보호를 하기 위해 복제를 하는건데 아무나 clone 메서드를 사용하면 안됨. 
	 * 반드시 Cloneable 인터페이스를 구현한 것을 명시적으로 표시해야 함. → 구현하지 않으면 예외발생.
	 */
	public String id;
	public String name;
	public String password;
	public int age;
	public boolean adult;
	
	public ThinCloneMember(String id, String name, String password, int age, boolean adult) {
		super();
		this.id = id;
		this.name = name;
		this.password = password;
		this.age = age;
		this.adult = adult;
	}
	
	// 얉은 복제를 통해 OriginalMember 객체를 리턴
	public ThinCloneMember getMember()  {
		ThinCloneMember cloned = null;
		try {
			cloned = (ThinCloneMember) clone();
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return cloned;
	}
}
