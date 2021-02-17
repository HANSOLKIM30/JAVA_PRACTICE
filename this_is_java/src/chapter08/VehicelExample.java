package chapter08;

// 강제 타입 변환
public class VehicelExample {
	
	public static void main(String[] args) {
		
		Vehicle vehicle = new Bus();
		
		vehicle.run();
		// vehicle.checkFare();	Vehicle 인터페이스에는 checkFare() 메소드가 없으므로 사용 불가,
		
		Bus bus = (Bus) vehicle;	// 강제 타입 변환
		
		bus.checkFare();	// Bus 클래스에는 checkFare가 있으므로 사용 가능
	}

}
