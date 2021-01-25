package chapter07;

import java.nio.file.StandardCopyOption;

// Tire를 부품으로 가지는 클래스
public class Car {
	// 필드
	Tire frontLeftTire = new Tire("앞왼쪽", 6);
	Tire frontRightTire = new Tire("앞오른쪽", 2);
	Tire backLeftTire = new Tire("뒤왼쪽", 3);
	Tire backRightTrie = new Tire("뒤오른쪽", 4);
	
	// 생성자
	
	// 메소드
	int run() {
		System.out.println("자동차가 달립니다.");
		if(this.frontLeftTire.roll() == false) {
			stop();
			return 1;
		} 
		if(this.frontRightTire.roll() == false) {
			stop();
			return 2;
		} 
		if(this.backLeftTire.roll() == false) {
			stop();
			return 3;
		} 
		if(this.backRightTrie.roll() == false) {
			stop();
			return 4;
		}
		return 0;
	}
	
	void stop() {
		System.out.println("자동차가 멈춥니다.");
	}
}
