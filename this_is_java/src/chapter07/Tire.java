package chapter07;
// 타이어 클래스
public class Tire {
	// 필드
	public int maxRotation;	// 최대 회전수(타이어 수명)
	public int accumulatedRotaiton;	// 누적 회전수
	public String location;	// 타이어의 위치
	
	// 생성자
	public Tire(String location, int maxRoataion) {
		this.location = location;
		this.maxRotation = maxRoataion;
	}
	
	// 메소드
	public boolean roll() {
		++accumulatedRotaiton; // 누적 회전수 1 증가.
		if(this.accumulatedRotaiton < this.maxRotation) {
			System.out.println(this.location + " Tire 수명: " + (maxRotation-accumulatedRotaiton) + "회");
			return true;
		} else {
			System.out.println("*** " + this.location + " Tire 펑크 ***");
			return false;
		}
	}
}
