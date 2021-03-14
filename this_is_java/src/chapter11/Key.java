package chapter11;
// hashCode()
public class Key {

	/*
	 * hashCode() 메소드는 각 객체의 메모리 번지를 이용하여 객체 별로 "객체 해시코드"라는 정수값을 생성한다.
	 * 따라서, 객체마다 각기 다른 "객체 해시코드"를 가지고 있음.
	 * 논리적으로 동등한지 알아보기 위해 hashCode() → equals() 과정을 거침.
	 */
	
	public int number;
	
	public Key(int number) {
		this.number = number;
	}

	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Key) {
			Key compareKey = (Key)obj;
			if(this.number == compareKey.number) {
				return true;
			}
		}
		return false;
	}

	@Override
	public int hashCode() {		
		return this.number;
	}
	
	
	
}
