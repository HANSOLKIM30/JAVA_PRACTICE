package chapter11;

import java.util.Arrays;

// Deep Clone: clone 메소드를 "오버라이딩"하여 참조객체까지 복사되도록 구현
public class DeepCloneMember implements Cloneable {

	public String name;
	public int age;
	// 참조 타입 필드(깊은 복제 대상)
	public int[] scores;
	public Car car;
	
	public DeepCloneMember(String name, int age, int[] scores, Car car) {
		this.name = name;
		this.age = age;
		this.scores = scores;
		this.car = car;
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		
		// 먼저 얕은 복사를 통해 기본 타입 필드인 name, age를 복제한다.
		DeepCloneMember cloned = (DeepCloneMember) super.clone();	// Object의 clone 호출
		
		// scores를 깊은 복제한다.
		cloned.scores = Arrays.copyOf(this.scores, this.scores.length);
		
		// Car를 깊은 복제한다.
		cloned.car = new Car(this.car.model);		
		
		// 깊은 복제된 객체를 리턴
		return cloned;
	}
	
	public DeepCloneMember getMember() {
		
		DeepCloneMember cloned = null;
		
		try {
			// 재정의된 해당 객체의 clone 메서드 호출
			cloned = (DeepCloneMember) this.clone();
		} catch (CloneNotSupportedException e) {
			
			e.printStackTrace();
		}
		
		return cloned;		
	}
}
