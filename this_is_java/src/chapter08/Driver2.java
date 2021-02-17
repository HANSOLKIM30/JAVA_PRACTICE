package chapter08;

// 객체 타입 확인
public class Driver2 {

	public void drive(Vehicle vehicle) {	// Vehicle 인터페이스의 구현 객체인 Bus, Taxi 둘 다 가능
		if(vehicle instanceof Bus) {	// vehicle 매개 변수가 참조하는 객체가 Bus인지 조사
			Bus bus = (Bus) vehicle;	// Bus 객체인 경우 안전하게 강제 타입 변환시킴.
			
			bus.checkFare();
		}
		vehicle.run();
	}
}
