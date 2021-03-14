package chapter15;

// 동전 클래스
public class Coin {

	private int value;
	
	public Coin(int value) {
		this.value = value;
	}
	
	public int getValue() {
		return this.value;
	}
	
	public void setValue(int value) {
		this.value = value;
	}
}
