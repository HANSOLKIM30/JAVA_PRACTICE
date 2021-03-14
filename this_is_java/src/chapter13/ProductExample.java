package chapter13;

// 멀티 타입 파라미터 제네릭 객체 생성
public class ProductExample {
	public static void main(String[] args) {
		Product<TV, String> product1 = new Product<TV, String>();
		product1.setKind(new TV());
		product1.setModel("스마트 TV");
		TV tv = product1.getKind();
		String tvModel = product1.getModel();
		
		Product<Car, String> product2 = new Product<Car, String>();
		product2.setKind(new Car());
		product2.setModel("디젤");
		Car car = product2.getKind();
		String carModel = product2.getModel();
	}

}
