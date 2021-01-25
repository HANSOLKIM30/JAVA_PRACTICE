package chapter07;
// Tire의 자식 클래스
public class KumhoTire extends Tire {

	//필드
	
	//생성자
	public KumhoTire(String location, int maxRoataion) {
		super(location, maxRoataion);	// super를 통해 부모의 생성자에 접근하여 필드 초기화
	}
	
	@Override
	public boolean roll() {
		++accumulatedRotaiton; // 누적 회전수 1 증가.
		if(this.accumulatedRotaiton < this.maxRotation) {
			System.out.println(this.location + " KumhoTire 수명: " + (maxRotation-accumulatedRotaiton) + "회");
			return true;
		} else {
			System.out.println("*** " + this.location + " KumhoTire 펑크 ***");
			return false;
		}
	}
}
